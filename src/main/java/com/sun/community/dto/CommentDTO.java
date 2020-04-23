package com.sun.community.dto;

import com.sun.community.model.User;
import lombok.Data;

/**
 * @author SunTong
 * @date 2020/4/23 15:56
 * @desc
 */
@Data
public class CommentDTO {

    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Long commentCount;
    private String content;

    private User user;

}
