package com.example.hiltsample.hilt.bean

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Engine
 */
interface Engine {
    fun start()
    fun shutdown()
}

/**
 * GasEngine
 */
@Singleton
class GasEngine @Inject constructor() : Engine {
    override fun start() {
        println("GasEngine Gas engine start.")
    }

    override fun shutdown() {
        println("GasEngine Gas engine shutdown.")
    }
}

/**
 * ElectricEngine
 */
@Singleton
class ElectricEngine @Inject constructor() : Engine {
    override fun start() {
        println("ElectricEngine Electric engine start.")
    }

    override fun shutdown() {
        println("ElectricEngine Electric engine shutdown.")
    }
}