package com.quiz.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.quiz.Entites.Quiz;
import com.quiz.Repositories.QuizRepository;
import com.quiz.Services.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

   
    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found"));
    }

}