package com.example.hiltsample.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.hiltsample.repository.Repository

/**
 * MainViewModel
 */
// @ActivityRetainedScoped
class MainViewModel @ViewModelInject constructor(private val repository: Repository) : ViewModel() {

    /**
     * doWork
     */
    fun doWork() {
        repository.doRepositoryWork()
    }

}