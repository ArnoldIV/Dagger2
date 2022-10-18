package com.arnold.dagger2.screens.common.fragments

import androidx.fragment.app.Fragment
import com.arnold.dagger2.common.dependnecyinjection.presentation.PresentationModule
import com.arnold.dagger2.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    private val presentationComponent by lazy {
        (requireActivity() as BaseActivity).activityComponent.newPresentationComponent(PresentationModule(this))
    }

    protected val injector get() = presentationComponent
}