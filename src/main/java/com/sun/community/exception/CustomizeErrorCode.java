package com.sun.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{


    QUESTION_ONT_FOUND("您查找的帖子不存在！");

    private String message;


    @Override
    public String getMessage(){
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }

}
