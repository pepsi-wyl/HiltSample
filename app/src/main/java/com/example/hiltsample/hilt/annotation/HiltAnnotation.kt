package com.example.hiltsample.hilt.annotation

import javax.inject.Qualifier

/**
 * BindGasEngine
 */
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindGasEngine

/**
 * BindElectricEngine
 */
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindElectricEngine