package com.arnold.dagger2.common.dependnecyinjection.activity

import androidx.appcompat.app.AppCompatActivity
import com.arnold.dagger2.common.dependnecyinjection.presentation.PresentationComponent
import com.arnold.dagger2.common.dependnecyinjection.presentation.PresentationModule
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun newPresentationComponent(presentationModule: PresentationModule): PresentationComponent

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance fun activity(activity: AppCompatActivity): Builder
        fun build(): ActivityComponent
    }

}