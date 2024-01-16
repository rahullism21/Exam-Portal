package com.quiz.entities;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Question")
public class Question {


    private Long questionId;
    private String question;
    private Long quizId;
}
