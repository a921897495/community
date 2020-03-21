package com.sun.community.model;

import lombok.Data;

@Data
public class Question {

    private Integer id;
    private String  title;  //标题
    private String  description;    //描述
    private String  tag;    //标签
    private Long gmtCreate;
    private Long  gmtModified;
    private Integer creator;    //创作者
    private Integer viewCount;  //阅读数
    private Integer commentCount;   //评论数
    private Integer likeCount;  //点赞数


}