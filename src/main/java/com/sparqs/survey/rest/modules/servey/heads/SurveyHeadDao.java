package com.sparqs.survey.rest.modules.servey.heads;

import org.springframework.stereotype.Repository;

import java.util.List;

import static com.sparqs.survey.rest.modules.servey.heads.SurveyHead.builder;
import static java.util.Arrays.asList;
import static java.util.UUID.fromString;

@Repository
public class SurveyHeadDao {
  public List<SurveyHead> getHeads() {
    return asList(
        quickCreate("Erste", true), quickCreate("Zweite", false), quickCreate("'Dritte", true));
  }

  private SurveyHead quickCreate(String title, boolean active) {
    return builder().title(title + " Umfrage").id(fromString(title)).active(active).build();
  }
}
