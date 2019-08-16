package com.sparqs.survey.rest.modules.servey.heads;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static java.util.Arrays.asList;

@Repository
public class SurveyHeadDao {
  public List<SurveyHeadDto> getHeads() {
    return asList(
        quickCreate("Erste", true), quickCreate("Zweite", false), quickCreate("'Dritte", true));
  }

  private SurveyHeadDto quickCreate(String title, boolean active) {
    return SurveyHeadDto.builder()
        .id(UUID.randomUUID())
        .title(title + " Umfrage")
        .active(active)
        .build();
  }
}
