package com.Service.QnA;

import com.Entity.QnA.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getList();

    Question getQuestion(Integer id);
}
