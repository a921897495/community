package com.sun.community.mapper;

import com.sun.community.model.Question;
import com.sun.community.model.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Component
public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    long countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    List<Question> selectByExampleWithBLOBsWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    List<Question> selectByExampleWithBLOBs(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    List<Question> selectByExampleWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    Question selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_question
     *
     * @mbg.generated Tue Mar 24 23:21:14 CST 2020
     */
    int updateByPrimaryKey(Question record);
}