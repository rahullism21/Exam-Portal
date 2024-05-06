package com.question.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.question.Entites.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

    List<Question> findByQuizId(Long quizId);
}
