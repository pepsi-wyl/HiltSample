package com.example.hiltsample.hilt.model

import com.example.hiltsample.hilt.annotation.BindElectricEngine
import com.example.hiltsample.hilt.annotation.BindGasEngine
import com.example.hiltsample.hilt.bean.ElectricEngine
import com.example.hiltsample.hilt.bean.Engine
import com.example.hiltsample.hilt.bean.GasEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * EngineModule
 */
@Module
@InstallIn(ApplicationComponent::class)
abstract class EngineModule {

    /**
     * bindGasEngine
     */
    @BindGasEngine
    @Binds
    abstract fun bindGasEngine(gasEngine: GasEngine): Engine

    /**
     * bindElectricEngine
     */
    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(electricEngine: ElectricEngine): Engine

}
