package com.sparqs.survey.rest.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SurveyEntity {

  @Id @GeneratedValue UUID id;

  String title;

  boolean active;

  @OneToMany(
      mappedBy = "surveyID",
      cascade = CascadeType.REMOVE) // Change after modelling questionresponse
  List<QuestionEntity> questionEntityList ;

  public void addQuestion(QuestionEntity questionEntity) {
    if (questionEntityList == null) questionEntityList = new ArrayList<>();
    questionEntityList.add(questionEntity);
  }
}
