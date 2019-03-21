package com.harmonycloud.enums;


public enum ErrorMsgEnum {

    SERVICE_ERROR("Internal service error"),
    QUERY_DATA_ERROR("query data error"),
    PARAMETER_ERROR("parameter error"),
    ROCKETMQ_ERROR("Rocketmq send message error");

    private String message;

    ErrorMsgEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
