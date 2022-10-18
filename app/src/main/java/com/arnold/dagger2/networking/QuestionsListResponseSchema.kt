package com.arnold.dagger2.networking

import com.google.gson.annotations.SerializedName
import com.arnold.dagger2.questions.Question

data class QuestionsListResponseSchema(@SerializedName("items") val questions: List<Question>)