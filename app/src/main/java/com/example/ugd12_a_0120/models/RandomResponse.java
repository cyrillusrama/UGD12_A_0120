package com.example.ugd12_a_0120.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RandomResponse {
    private String message;

    @SerializedName("random")
    private List<Random> randomList;

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public List<Random> getRandomList() { return randomList; }

    public void setRandomList(List<Random> profilList) { this.randomList = randomList; }
}
