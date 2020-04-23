package com.sun.community.controller;

import com.sun.community.dto.CommentCreateDTO;
import com.sun.community.dto.CommentDTO;
import com.sun.community.dto.QuestionDTO;
import com.sun.community.service.CommentService;
import com.sun.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.*;
import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id, Model model){

        QuestionDTO questionDTO=questionService.getById(id);
        List<CommentDTO> comments = commentService.listByQuestionId(id);
        //累计阅读数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);


        return "question";
    }


}
