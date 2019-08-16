package com.sparqs.survey.rest.repositories;


import com.sparqs.survey.rest.entities.SurveyEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SurveyRepository extends CrudRepository<SurveyEntity,UUID>{
}
