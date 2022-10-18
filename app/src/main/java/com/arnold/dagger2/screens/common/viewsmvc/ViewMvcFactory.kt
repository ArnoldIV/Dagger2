package com.arnold.dagger2.screens.common.viewsmvc

import android.view.LayoutInflater
import android.view.ViewGroup
import com.arnold.dagger2.screens.common.imageloader.ImageLoader
import com.arnold.dagger2.screens.questiondetails.QuestionDetailsViewMvc
import com.arnold.dagger2.screens.questionslist.QuestionsListViewMvc
import javax.inject.Inject
import javax.inject.Provider

class ViewMvcFactory @Inject constructor(
        private val layoutInflaterProvider: Provider<LayoutInflater>,
        private val imageLoaderProvider: Provider<ImageLoader>
) {

    fun newQuestionsListViewMvc(parent: ViewGroup?): QuestionsListViewMvc {
        return QuestionsListViewMvc(layoutInflaterProvider.get(), parent)
    }

    fun newQuestionDetailsViewMvc(parent: ViewGroup?): QuestionDetailsViewMvc {
        return QuestionDetailsViewMvc(layoutInflaterProvider.get(), imageLoaderProvider.get(), parent)
    }
}