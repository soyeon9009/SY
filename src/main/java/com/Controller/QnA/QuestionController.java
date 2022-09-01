package com.Controller.QnA;

import com.Entity.QnA.Question;
import com.Service.QnA.QuestionService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/QnA")
public class QuestionController {


    private final QuestionService questionService;

    @Autowired
    protected QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @RequestMapping("questionList")
    public String getList(Model model){
        model.addAttribute("questionList", questionService.getList());
        return "QnA/questionList";
    }
//
    @RequestMapping( value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id){
        model.addAttribute("question",questionService.getQuestion(id));
        return "QnA/detail";
    }

//    @GetMapping("/detail")
//    public String detail(Model model, Integer id){
//       model.addAttribute("question", questionService.getQuestion(id));
//        return "/QnA/detail";
//    }



}
