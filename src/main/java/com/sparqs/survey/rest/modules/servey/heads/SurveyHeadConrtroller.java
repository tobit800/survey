package com.sparqs.survey.rest.modules.servey.heads;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class SurveyHeadConrtroller {

  @Autowired private SurveyHeadService surveyHeadService;

  @RequestMapping("/api/admin/surveyhead")
  public List<SurveyHeadDto> getSurveyHeads() {
    List<SurveyHeadDto> surveyHeads = surveyHeadService.getSurveyHeads();
    log.info("Return {} Survey-Heads", surveyHeads.size());
    return surveyHeads;
  }
}
