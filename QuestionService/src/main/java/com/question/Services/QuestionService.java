package com.question.Services;


import java.util.List;

import com.question.Entites.Question;

public interface QuestionService {

   //CREATE 
    Question create(Question question);

    //get
    List<Question> get();

    //get one
    Question getOne(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
