package com.example.hiltsample.hilt.model

import android.app.Application
import com.example.hiltsample.AppApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * ApplicationModule
 */
@Module
@InstallIn(ApplicationComponent::class)
class AppApplicationModule {

    /**
     * provideAppApplication
     */
    @Singleton
    @Provides
    fun provideAppApplication(application: Application): AppApplication {
        return application as AppApplication
    }
}