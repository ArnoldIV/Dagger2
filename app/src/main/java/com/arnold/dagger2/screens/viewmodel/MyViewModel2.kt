package com.arnold.dagger2.screens.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arnold.dagger2.questions.FetchQuestionDetailsUseCase
import com.arnold.dagger2.questions.FetchQuestionsUseCase
import com.arnold.dagger2.questions.Question
import javax.inject.Inject

class MyViewModel2 @Inject constructor(
        private val fetchQuestionsUseCase: FetchQuestionsUseCase,
        private val fetchQuestionDetailsUseCase: FetchQuestionDetailsUseCase
): ViewModel() {

    private val _questions = MutableLiveData<List<Question>>()
    val questions: LiveData<List<Question>> = _questions

}