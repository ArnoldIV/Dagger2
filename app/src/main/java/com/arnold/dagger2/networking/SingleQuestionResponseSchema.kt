package com.arnold.dagger2.networking

import com.google.gson.annotations.SerializedName
import com.arnold.dagger2.questions.QuestionWithBody

data class SingleQuestionResponseSchema(@SerializedName("items") val questions: List<QuestionWithBody>) {
    val question: QuestionWithBody get() = questions[0]
}