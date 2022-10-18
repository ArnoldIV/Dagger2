package com.arnold.dagger2.screens.common.dialogs

import androidx.fragment.app.DialogFragment
import com.arnold.dagger2.common.dependnecyinjection.presentation.PresentationModule
import com.arnold.dagger2.screens.common.activities.BaseActivity

open class BaseDialog: DialogFragment() {

    private val presentationComponent by lazy {
        (requireActivity() as BaseActivity).activityComponent.newPresentationComponent(PresentationModule(this))
    }

    protected val injector get() = presentationComponent
}