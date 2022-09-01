package com.Service.QnA;

import com.Entity.BaseTime.BaseTimeEntity;
import com.Entity.QnA.Answer;
import com.Entity.QnA.Question;
import com.Repository.QnA.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.BaseRowSet;
import java.time.LocalDateTime;

@Service
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepository answerRepository;

    @Autowired
    protected AnswerServiceImpl (AnswerRepository answerRepository){
        this.answerRepository = answerRepository;
    }


    @Override
    public void createAnswer(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setQuestion(question);
        answer.setCreateDate(LocalDateTime.now());
        answerRepository.save(answer);

    }
}
