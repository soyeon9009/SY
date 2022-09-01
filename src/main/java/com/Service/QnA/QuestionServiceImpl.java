package com.Service.QnA;

import com.Entity.QnA.Question;
import com.Exception.DataNotFoundException;
import com.Repository.QnA.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    protected QuestionServiceImpl(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }


    @Override
    public List<Question> getList() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestion(Integer id) {
//        Optional<Question> question = questionRepository.findById(id);
        //복잡한 조건문 없이도 널(null) 값으로 인해 발생하는 예외를 처리할 수 있게 됨.
//        if(question.isPresent()){
//            return question.get();
//        } else{
//            throw new DataNotFoundException("question not found");
//
//        }
        return questionRepository.findById(id).get();

    }

}
