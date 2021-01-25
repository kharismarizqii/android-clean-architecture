package com.dicoding.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.domain.model.Tourism
import com.dicoding.tourismapp.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

