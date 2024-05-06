package com.quiz.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quiz.Entites.Quiz;

public interface QuizService {

    @Autowired
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);

}
