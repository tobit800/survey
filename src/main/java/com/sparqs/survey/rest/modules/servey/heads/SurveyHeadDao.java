package com.sparqs.survey.rest.modules.servey.heads;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static java.util.Arrays.asList;
import static java.util.UUID.fromString;

@Repository
public class SurveyHeadDao {
  public List<SurveyHead> getHeads() {
    return asList(
        quickCreate("Erste", true), quickCreate("Zweite", false), quickCreate("'Dritte", true));
  }

  private SurveyHead quickCreate(String title, boolean active) {
    return SurveyHead.builder()
        .id(UUID.randomUUID())
        .title(title + " Umfrage")
        .active(active)
        .build();
  }
}
