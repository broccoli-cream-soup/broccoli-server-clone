package soup.cream.broccoli.survey.business.survey.dto.create

import soup.cream.broccoli.survey.business.survey.dto.SurveyTypeDto
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class SurveyCreateDto(
    @field:NotNull
    @field:NotBlank
    val name: String,
    @field:NotNull
    val description: String,

    @field:NotNull
    val surveyType: SurveyTypeDto = SurveyTypeDto.ANONYMOUS,
)
