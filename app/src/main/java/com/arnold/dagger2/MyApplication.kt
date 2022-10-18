package com.arnold.dagger2

import android.app.Application
import com.arnold.dagger2.common.dependnecyinjection.app.AppComponent
import com.arnold.dagger2.common.dependnecyinjection.app.AppModule
import com.arnold.dagger2.common.dependnecyinjection.app.DaggerAppComponent

class MyApplication: Application() {

    public val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}