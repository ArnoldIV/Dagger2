package com.arnold.dagger2.screens.common

import androidx.appcompat.app.AppCompatActivity
import com.arnold.dagger2.screens.questiondetails.QuestionDetailsActivity
import com.arnold.dagger2.screens.viewmodel.ViewModelActivity
import javax.inject.Inject

class ScreensNavigatorImpl @Inject constructor(private val activity: AppCompatActivity): ScreensNavigator {

    override fun navigateBack() {
        activity.onBackPressed()
    }

    override fun toQuestionDetails(questionId: String) {
        QuestionDetailsActivity.start(activity, questionId)
    }

    override fun toViewModel() {
        ViewModelActivity.start(activity)
    }
}