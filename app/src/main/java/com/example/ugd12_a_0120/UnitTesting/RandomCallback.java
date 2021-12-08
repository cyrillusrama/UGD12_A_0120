package com.example.ugd12_a_0120.UnitTesting;

import com.example.ugd12_a_0120.models.Random;

public interface RandomCallback {
    void onSuccess(boolean value, Random random);
    void onError();
}
