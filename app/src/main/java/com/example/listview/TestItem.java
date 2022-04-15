package com.example.listview;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TestItem {
    @SerializedName("statusCode")
    public int statusCode;
    @SerializedName("message")
    public String message;
    @SerializedName("body")
    public List<Data> body;

    @Override
    public String toString() {
        return "TestItem{" + "body=" + body + "}";
    }
}
