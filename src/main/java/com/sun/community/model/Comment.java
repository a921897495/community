package com.sun.community.model;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.id
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.parent_id
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.type
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.commentator
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Long commentator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.gmt_create
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.gmt_modified
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.like_count
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private Long likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_comment.content
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.id
     *
     * @return the value of table_comment.id
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.id
     *
     * @param id the value for table_comment.id
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.parent_id
     *
     * @return the value of table_comment.parent_id
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.parent_id
     *
     * @param parentId the value for table_comment.parent_id
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.type
     *
     * @return the value of table_comment.type
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.type
     *
     * @param type the value for table_comment.type
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.commentator
     *
     * @return the value of table_comment.commentator
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Long getCommentator() {
        return commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.commentator
     *
     * @param commentator the value for table_comment.commentator
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setCommentator(Long commentator) {
        this.commentator = commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.gmt_create
     *
     * @return the value of table_comment.gmt_create
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.gmt_create
     *
     * @param gmtCreate the value for table_comment.gmt_create
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.gmt_modified
     *
     * @return the value of table_comment.gmt_modified
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.gmt_modified
     *
     * @param gmtModified the value for table_comment.gmt_modified
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.like_count
     *
     * @return the value of table_comment.like_count
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.like_count
     *
     * @param likeCount the value for table_comment.like_count
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_comment.content
     *
     * @return the value of table_comment.content
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_comment.content
     *
     * @param content the value for table_comment.content
     *
     * @mbg.generated Sun Apr 05 03:59:39 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}