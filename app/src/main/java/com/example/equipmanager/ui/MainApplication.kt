package com.example.equipmanager.ui

import android.app.Application
import com.example.equipmanager.BuildConfig
import org.koin.android.ext.android.startKoin
import org.koin.android.logger.AndroidLogger
import org.koin.log.EmptyLogger

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            //Debug.initialize(this)
            startKoin(this, com.example.equipmanager.di.Module.modules, logger = AndroidLogger(true))
        } else {
            startKoin(this, com.example.equipmanager.di.Module.modules, logger = EmptyLogger())
        }
    }
}