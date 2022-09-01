package com.Controller.QnA;

import com.Entity.QnA.Answer;
import com.Entity.QnA.Question;
import com.Repository.QnA.AnswerRepository;
import com.Service.QnA.AnswerService;
import com.Service.QnA.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RequestMapping("/QnA")
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    @Autowired
    public AnswerController(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

//    @PostMapping("/create")
//    public String createAnswer(@RequestParam("id") Integer id, @RequestParam("content") String content){
//
//        Question question = this.questionService.getQuestion(id);
//        System.out.println("=======================");
//        System.out.println(id);
//        System.out.println(question.getId());
//        System.out.println(content);
//        System.out.println("=======================");
//
//        answerService.createAnswer(question,content);
//        return "redirect:/QnA/detail?id="+id;
//    }

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
        Question question = this.questionService.getQuestion(id);
        // TODO: 답변을 저장한다.
        return String.format("redirect:/QnA/detail/%s", id);
    }
//


}
