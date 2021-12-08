package com.example.ugd12_a_0120.UnitTesting;


import com.example.ugd12_a_0120.models.Random;

public class RandomPresenter {
    private RandomView view;
    private RandomService service;
    private RandomCallback callback;
    private Random random;
    public RandomPresenter(RandomView view, RandomService service) {
        this.view = view;
        this.service = service;
    }
    public void onRandomClicked() {
        String regexNum = "[0-9]+";
        String regexAlpha = "[a-zA-Z]+";
        String regexAlphaNum = "^[A-Za-z0-9]+$";
        String regexEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String regexAlpha2Words = "[A-Za-z]+\\s+[A-Za-z]+";

        // Sumber pattern:
        https://developer.android.com/reference/java/util/regex/Pattern
        if (view.getEmail().isEmpty()) {
            view.showEmailError("Atribut email tidak boleh kosong.");
            return;
        } else if(!(view.getEmail().matches(regexEmail))){
            view.showEmailError("Format email tidak sesuai aturan.");
            return;
        } else if(view.getPassword().isEmpty()){
            view.showPasswordError("Atribut password tidak boleh kosong.");
            return;
        } else if(!(view.getPassword().matches(regexAlphaNum))){
            view.showPasswordError("The password must be at least 6 characters.");
            return;
        } else if(view.getKotaAsal().isEmpty()){
            view.showKotaAsalError("Atribut kota tidak boleh kosong.");
            return;
        } else if(!(view.getKotaAsal().matches(regexAlphaNum))){
            view.showKotaAsalError("Format kota asal tidak sesuai aturan.");
            return;
        } else {
            service.random(view, random, new RandomCallback() {
                @Override
                public void onSuccess(boolean value, Random random)
                {
                    view.startMainRandom();
                }
                @Override
                public void onError() {
                }
            });
            return;
        }
    }
}
