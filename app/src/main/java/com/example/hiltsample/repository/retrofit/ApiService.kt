package com.example.hiltsample.repository.retrofit

import com.example.hiltsample.repository.model.Province
import retrofit2.http.GET

/**
 * ApiService
 */
interface ApiService {

    /**
     * getProvinces
     */
    @GET("api/china")
    suspend fun getProvinces(): List<Province>

}