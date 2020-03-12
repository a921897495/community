package com.sun.community.service;

import com.sun.community.dto.QuestionDTO;
import com.sun.community.mapper.QuestionMapper;
import com.sun.community.mapper.UserMapper;
import com.sun.community.model.Question;
import com.sun.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {

        List<Question> questionList = questionMapper.list();
        List<QuestionDTO> questionDTOList=new ArrayList<QuestionDTO>();
        for (Question question : questionList) {

            User user=userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }

        return questionDTOList;
    }
}
