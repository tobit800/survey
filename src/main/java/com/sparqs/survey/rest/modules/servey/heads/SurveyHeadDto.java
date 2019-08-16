package com.sparqs.survey.rest.modules.servey.heads;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class SurveyHeadDto {
    UUID id;
    String title;
    boolean active;
}
