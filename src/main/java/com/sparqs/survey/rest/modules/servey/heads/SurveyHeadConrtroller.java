package com.sparqs.survey.rest.modules.servey.heads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyHeadConrtroller {

  @Autowired private SurveyHeadService surveyHeadService;

  @RequestMapping("/api/admin/surveyhead")
  public List<SurveyHead> getSurveyHeads() {
    return surveyHeadService.getSurveyHeads();
  }
}
