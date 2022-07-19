package com.elton.app.repositories

import android.app.Application
import com.elton.app.repositories.data.di.DataModule
import com.elton.app.repositories.domain.di.DomainModule
import com.elton.app.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}