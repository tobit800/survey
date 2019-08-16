package com.sparqs.survey.rest.repositories;

import com.sparqs.survey.rest.entities.QuestionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface QuestionRepository extends CrudRepository<QuestionEntity, UUID> {
}
