package com.example.hiltsample.repository

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository
 */
@Singleton
class Repository @Inject constructor() {

    /**
     * doRepositoryWorks
     */
    fun doRepositoryWork() {
        println("Do some work in Repository.")
    }

}