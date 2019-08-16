package com.sparqs.survey.rest.testdata;

import com.sparqs.survey.rest.entities.QuestionEntity;
import com.sparqs.survey.rest.entities.SurveyEntity;
import com.sparqs.survey.rest.modules.servey.heads.SurveyHeadDto;
import com.sparqs.survey.rest.repositories.SurveyRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.IntStream;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Slf4j
@Component
@Profile("testdata")
public class TestDataFactory {

  @Autowired private SurveyRepository surveyRepository;

  /** Add some persistent testdata after server start. */
  @EventListener(ApplicationReadyEvent.class)
  public void doSomethingAfterStartup() {
    log.info("Create some test data now ...");

    SurveyEntity surveyEntity = quickCreate("PersistentDemo", true);
    IntStream.of(10).forEach(nr -> surveyEntity.addQuestion(quickCreate(surveyEntity, nr)));
    surveyRepository.save(surveyEntity);
  }

  private SurveyEntity quickCreate(String title, boolean active) {
    return SurveyEntity.builder()
        .title(title)
        .active(active)
        .build();
  }

  private QuestionEntity quickCreate(SurveyEntity surveyEntity, int nr) {
    return QuestionEntity.builder()
            .sortOrder(nr)
            .questionText(randomAlphabetic(80))
            .responseType("Demo")
            .build();
  }
}
