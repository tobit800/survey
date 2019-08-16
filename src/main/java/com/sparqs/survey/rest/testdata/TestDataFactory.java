package com.sparqs.survey.rest.testdata;

import com.sparqs.survey.rest.repositories.SurveyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Profile("testdata")
public class TestDataFactory {


  @Autowired
  private SurveyRepository surveyRepository;

  @EventListener(ApplicationReadyEvent.class)
  public void doSomethingAfterStartup() {
    log.info("Create some test data now ...");
  }
}
