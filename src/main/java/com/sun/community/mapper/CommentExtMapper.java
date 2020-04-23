package com.sun.community.mapper;

import com.sun.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}