package dev.jombi.template.business.survey.service

import dev.jombi.template.business.survey.CreateDto.create.QuestionCreateDto
import dev.jombi.template.business.survey.dto.QuestionDto
import dev.jombi.template.business.survey.dto.create.SurveyCreateDto
import dev.jombi.template.business.survey.dto.SurveyDto
import dev.jombi.template.business.survey.dto.SurveyEditDto
import org.springframework.stereotype.Service

@Service
interface SurveyService {
    fun createSurvey(dto: SurveyCreateDto): SurveyDto
    fun getSurvey(surveyId: String): SurveyDto
    fun editSurvey(surveyId: String, surveyEditDto: SurveyEditDto): SurveyDto
    fun deleteSurvey(surveyId: String)

    fun addQuestion(surveyId: String, questionCreateDto: QuestionCreateDto)
    fun getQuestion(surveyId: String, questionId: String): QuestionDto
    fun editQuestion(surveyId: String, questionId: String, surveyCreateDto: QuestionCreateDto)
    fun deleteQuestion(surveyId: String, questionId: String)
}
