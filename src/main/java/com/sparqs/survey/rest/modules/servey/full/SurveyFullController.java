package com.sparqs.survey.rest.modules.servey.full;

import com.sparqs.survey.rest.entities.SurveyEntity;
import com.sparqs.survey.rest.modules.servey.heads.SurveyHeadDto;
import com.sparqs.survey.rest.repositories.SurveyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
public class SurveyFullController {

  public static final String API_ADMIN_SURVEY = "/api/admin/survey";
  public static final String API_ADDMIN_SURVEY_ID = API_ADMIN_SURVEY + "/{uuid}";

  @Autowired private SurveyRepository surveyRepository;

  @RequestMapping(API_ADMIN_SURVEY)
  public Iterable<SurveyEntity> getSurvey() {
    return surveyRepository.findAll();
  }

  @PostMapping(API_ADMIN_SURVEY)
  public SurveyEntity createOrSave(@RequestBody SurveyEntity surveyEntity) {
    return surveyRepository.save(surveyEntity);
  }

  @RequestMapping(API_ADDMIN_SURVEY_ID)
  public SurveyEntity getSurveyById(UUID uuid) {
    return surveyRepository.findById(uuid).orElseThrow(RuntimeException::new);
  }

  @DeleteMapping(API_ADDMIN_SURVEY_ID)
  public boolean deleteSurvey(@PathVariable UUID uuid) {
    try {
      surveyRepository.deleteById(uuid);
      return true;
    } catch (RuntimeException rtExc) {
      log.info("Can not delete survey {}. Reason: {}", uuid, rtExc.getMessage());
      return false;
    }
  }
}
