package com.example.hiltsample.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.hiltsample.R
import com.example.hiltsample.hilt.bean.Truck
import com.example.hiltsample.repository.retrofit.ApiService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * MainActivity
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /**
     * Truck
     */
    @Inject
    lateinit var truck: Truck

    /**
     * OkHttpClient
     */
    @Inject
    lateinit var httpClient: OkHttpClient

    /**
     * Retrofit
     */
    @Inject
    lateinit var retrofit: Retrofit

    /**
     * apiService
     */
    @Inject
    lateinit var apiService: ApiService

    /**
     * MainViewModel
     */
    // @Inject
    // lateinit var viewModel: MainViewModel

    /**
     * MainViewModel
     */
    private val viewModel: MainViewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }

    /**
     * onCreates
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Show how to use Hilt in simple way.
        truckDeliverBtn.setOnClickListener {
            truck.deliver()
        }

        // Show how to use Hilt with 3rd party libraries.
        networkRequestBtn.setOnClickListener {
            // val apiService = retrofit.create(ApiService::class.java)
            lifecycleScope.launch(Dispatchers.IO) {
                val provinces = apiService.getProvinces()
                for (province in provinces) {
                    println("retrofit" + province.name)
                }
            }
        }

        // Show how to use Hilt with ViewModel.
        viewModelWorkBtn.setOnClickListener {
            viewModel.doWork()
        }
    }

}