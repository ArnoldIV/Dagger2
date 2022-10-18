package com.arnold.dagger2.common.dependnecyinjection.app

import com.arnold.dagger2.common.dependnecyinjection.activity.ActivityComponent
import com.arnold.dagger2.common.dependnecyinjection.service.ServiceComponent
import com.arnold.dagger2.common.dependnecyinjection.service.ServiceModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun newActivityComponentBuilder(): ActivityComponent.Builder

    fun newServiceComponent(serviceModule: ServiceModule): ServiceComponent

}