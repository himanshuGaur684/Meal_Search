package com.gaur.mealsearch.data.repository

import com.gaur.mealsearch.data.model.MealsDTO
import com.gaur.mealsearch.data.remote.MealSearchAPI
import com.gaur.mealsearch.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}