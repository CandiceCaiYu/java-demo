package com.example.demo;

public class Response <T>{
    private T data;
    private Boolean success;
    private String errorMessage;

    public static <K>  Response<K> newSuccess(K data) {
        Response response = new Response<K>();
        response.setData(data);
        response.setSuccess(true);
        return response;
    }

    public  static Response<Void> newFail(String errorMessage) {
        Response response = new Response<Void>();
        response.setSuccess(false);
        response.setErrorMessage(errorMessage);
        return response;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
