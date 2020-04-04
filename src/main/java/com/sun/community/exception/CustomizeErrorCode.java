package com.sun.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{


    QUESTION_NOT_FOUND(2001,"您查找的帖子不存在！"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何帖子或评论进行回复！"),
    NO_LOGIN(2003,"未登录不能进行评论，请先登录！"),
    SYS_ERROR(2004,"服务异常，请重试！"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在！"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在！");


    private String message;
    private Integer code;


    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
