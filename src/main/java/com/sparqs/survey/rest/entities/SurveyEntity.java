package com.sparqs.survey.rest.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Builder
@Data
@Entity
public class SurveyEntity {

  @Id @GeneratedValue UUID id;

  String title;

  boolean active;

  @OneToMany(mappedBy = "surveyID", cascade = CascadeType.REMOVE) // Change after modelling questionresponse
  List<QuestionEntity> question;
}
