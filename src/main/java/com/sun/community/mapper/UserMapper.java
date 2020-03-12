package com.sun.community.mapper;

import com.sun.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    @Insert("insert into TABLE_USER(name,account_id,token,gmt_create,gmt_modified,avatar_url) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    public void insert(User user);

    @Select("select * from TABLE_USER where token=#{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from TABLE_USER where id=#{id}")
    User findById(@Param("id") Integer creator);
}
