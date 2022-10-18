package com.arnold.dagger2.common.dependnecyinjection.presentation

import com.arnold.dagger2.screens.questiondetails.QuestionDetailsActivity
import com.arnold.dagger2.screens.questionslist.QuestionsListActivity
import com.arnold.dagger2.screens.questionslist.QuestionsListFragment
import com.arnold.dagger2.screens.viewmodel.ViewModelActivity
import dagger.Subcomponent

@PresentationScope
@Subcomponent(modules = [PresentationModule::class, ViewModelModule::class])
interface PresentationComponent {
    fun inject(fragment: QuestionsListFragment)
    fun inject(activity: QuestionDetailsActivity)
    fun inject(questionsListActivity: QuestionsListActivity)
    fun inject(viewModelActivity: ViewModelActivity)
}