package com.utils;

public class GenUserId {

    private Long techUserId;

    public Long getTechUserId() {
        if (techUserId == null) {
            techUserId = 111111222L;
        }
        return techUserId;
    }

    public void setTechUserId(Long technicalUserId) {
        this.techUserId = technicalUserId;
    }

    public static GenUserId createInstance() {
        return new GenUserId();
    }
}
