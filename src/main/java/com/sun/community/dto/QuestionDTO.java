package com.sun.community.dto;

import com.sun.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {

    private Long id;
    private String  title;
    private String  description;
    private String  tag;
    private Long gmtCreate;
    private Long  gmtModified;
    private Long creator;
    private Long viewCount;
    private Long commentCount;
    private Long likeCount;

    private User user;

}
