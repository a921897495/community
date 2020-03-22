package com.sun.community.mapper;


import com.sun.community.model.Question;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface QuestionMapper {

    @Insert("insert into table_question(title,description,gmt_create,gmt_modified,creator,tag) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);

    @Select("select * from table_question limit #{offset},#{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size")Integer size);

    @Select("select count(*) from table_question")
    Integer count();

    @Select("select * from table_question where creator=#{userId} limit #{offset},#{size}")
    List<Question> listByUserId(@Param("userId") Integer userId, @Param(value = "offset") Integer offset, @Param(value = "size")Integer size);

    @Select("select count(*) from table_question where creator=#{userId}")
    Integer countByUserId(@Param("userId")Integer userId);

    @Select("select * from table_question where id=#{id}")
    Question getById(@Param("id")Integer id);

    @Update("update table_question set title=#{title}, description=#{description}, gmt_modified=#{gmtModified}, tag=#{tag} where id =#{id}")
    void update(Question question);
}
