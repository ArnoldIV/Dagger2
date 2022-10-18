package com.arnold.dagger2.screens.common

interface ScreensNavigator {

    fun navigateBack()

    fun toQuestionDetails(questionId: String)
    fun toViewModel()
}