package com.aaron.springbootdemo.cotroller;

public class JsonOutput {
    private String response;

    public JsonOutput(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
