package com.question.controllers;

import com.question.entites.Question;
import com.question.services.QuesionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuesionService quesionService;

    public QuestionController(QuesionService quesionService) {
        this.quesionService = quesionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return  quesionService.create(question);
    }

    @GetMapping
    public List<Question> getAll() {
        return  quesionService.get();
    }

    @GetMapping("/{questionId}")
    public Question getAll(@PathVariable Long questionId) {
        return  quesionService.getOne(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public  List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return quesionService.getQuestionsOfQuiz(quizId);
    }
}

