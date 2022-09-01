package com.Service.QnA;

import com.Entity.QnA.Answer;
import com.Entity.QnA.Question;
import com.Repository.QnA.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AnswerService {


    void createAnswer(Question question, String content);
}
