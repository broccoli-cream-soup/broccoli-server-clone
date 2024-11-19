package dev.jombi.template.business.survey.dto

import jakarta.validation.constraints.NotBlank

data class SurveyEditDto(
    @field:NotBlank
    val name: String?,
    val description: String?,
    val surveyType: SurveyTypeDto?,
)
