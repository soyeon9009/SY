package com.Controller.QnA;

import com.Entity.QnA.Question;
import com.Service.QnA.AnswerService;
import com.Service.QnA.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/QnA")
@Controller
public class AnswerController {

    private final QuestionService questionService;
    private final AnswerService answerService;

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
    public String createAnswer(@PathVariable("id") Integer id, @RequestParam String content) {
        Question question = questionService.getQuestion(id);
        answerService.createAnswer(question,content);
        // TODO: 답변을 저장한다.
        return String.format("redirect:/QnA/detail/%s", id);
    }
//


}
