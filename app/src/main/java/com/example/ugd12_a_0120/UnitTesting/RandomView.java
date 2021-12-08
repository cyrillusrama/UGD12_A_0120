package com.example.ugd12_a_0120.UnitTesting;

public interface RandomView {
    String getEmail();
    void showEmailError(String message);

    String getPassword();
    void showPasswordError(String message);

    String getKotaAsal();
    void showKotaAsalError(String message);

    void startMainRandom();

    void showRandomError(String message);
    void showErrorResponse(String message);
}
