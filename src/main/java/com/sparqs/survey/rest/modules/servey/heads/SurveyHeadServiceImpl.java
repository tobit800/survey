package com.sparqs.survey.rest.modules.servey.heads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyHeadServiceImpl implements SurveyHeadService {
    @Autowired
    private SurveyHeadDao surveyHeadDao;

    @Override
    public List<SurveyHead> getSurveyHeads() {
        return surveyHeadDao.getHeads();
    }
}
