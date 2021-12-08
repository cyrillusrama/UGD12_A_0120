package com.example.ugd12_a_0120.UnitTesting;

import com.example.ugd12_a_0120.api.ApiClient;
import com.example.ugd12_a_0120.api.ApiInterface;
import com.example.ugd12_a_0120.models.Random;
import com.example.ugd12_a_0120.models.RandomResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RandomService {

    public void random(final RandomView view, Random random, final
    RandomCallback callback)
    {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<RandomResponse> randomDAOCall =
                apiService.createRandom(random);
        randomDAOCall.enqueue(new Callback<RandomResponse>() {
            @Override
            public void onResponse(Call<RandomResponse> call,
                                   Response<RandomResponse> response) {

                if(response.body().getMessage().equalsIgnoreCase("Data random berhasil ditambahkan."
                )){
                    callback.onSuccess(true,
                            response.body().getRandomList().get(0));
                }
                else{
                    callback.onError();
                    view.showRandomError(response.body().getMessage());
                }
            }
            @Override
            public void onFailure(Call<RandomResponse> call, Throwable
                    t) {
                view.showErrorResponse(t.getMessage());
                callback.onError();
            }
        });
    }
    public Boolean getValid(final RandomView view, Random profil) {
        final Boolean[] bool = new Boolean[1];
        random(view, profil, new RandomCallback() {
            @Override
            public void onSuccess(boolean value, Random profil) {
                bool[0] = true;
            }
            @Override
            public void onError() {
                bool[0] = false;
            }
        });
        return bool[0];
    }


}
