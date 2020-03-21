package com.sun.community.mapper;

import com.sun.community.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    @Insert("insert into TABLE_USER(name,account_id,token,gmt_create,gmt_modified,avatar_url) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from TABLE_USER where token=#{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from TABLE_USER where id=#{id}")
    User findById(@Param("id") Integer creator);

    @Select("select * from TABLE_USER where account_id=#{accountId}")
    User findByAccountId(@Param("accountId") String accountId);

    @Update("update table_user set name=#{name}, token=#{token}, gmt_modified=#{gmtModified}, avatar_url=#{avatarUrl} where id=#{id}")
    void update(User dbUser);
}


