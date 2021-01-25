package com.dicoding.tourismapp.domain.repository

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.domain.model.Tourism

interface ITourismRepository {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}