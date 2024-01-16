package com.question.services.impl;

import com.question.entites.Question;
import com.question.respositories.QuestionRepository;
import com.question.services.QuesionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuesionService {
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
           return questionRepository.findByQuizId(quizId);
    }
}
