package com.arnold.dagger2.common.service

import android.app.Service
import com.arnold.dagger2.MyApplication
import com.arnold.dagger2.common.dependnecyinjection.service.ServiceModule

abstract class BaseService: Service() {

    private val appComponent get() = (application as MyApplication).appComponent

    val serviceComponent by lazy {
        appComponent.newServiceComponent(ServiceModule(this))
    }

}