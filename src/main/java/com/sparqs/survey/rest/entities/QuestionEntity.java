package com.sparqs.survey.rest.entities;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;
@Builder
@Data
@Entity
public class QuestionEntity {
  @Id @GeneratedValue
  UUID id;
  String questionText;
  int sortOrder;
  String responseType;
  UUID surveyID;
}

