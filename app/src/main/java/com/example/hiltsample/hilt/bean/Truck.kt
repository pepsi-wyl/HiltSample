package com.example.hiltsample.hilt.bean

import com.example.hiltsample.hilt.annotation.BindElectricEngine
import com.example.hiltsample.hilt.annotation.BindGasEngine
import javax.inject.Inject

class Truck @Inject constructor(private val driver: Driver) {

    /**
     * gasEngine
     */
    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    /**
     * electricEngine
     */
    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    /**
     * deliver
     */
    fun deliver() {
        gasEngine.start()
        electricEngine.start()
        println("Truck is delivering cargo. Driven by $driver")
        gasEngine.shutdown()
        electricEngine.shutdown()
    }

}