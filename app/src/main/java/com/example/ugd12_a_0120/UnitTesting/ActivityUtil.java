package com.example.ugd12_a_0120.UnitTesting;

import android.content.Context;
import android.content.Intent;

import com.example.ugd12_a_0120.RandomActivity;

public class ActivityUtil {
    private Context context;

    public ActivityUtil(Context context) {
        this.context = context;
    }

    public void startMainRandom() {
        context.startActivity(new Intent(context, RandomActivity.class));
    }
}
