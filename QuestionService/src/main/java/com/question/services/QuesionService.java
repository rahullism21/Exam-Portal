package com.question.services;

import com.question.entites.Question;

import java.util.List;

public interface QuesionService {

    Question create(Question question);

    List<Question> get();

    Question getOne (Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
