package com.gaur.mealsearch.data.repository

import com.gaur.mealsearch.data.model.MealsDTO
import com.gaur.mealsearch.data.remote.MealSearchAPI
import com.gaur.mealsearch.domain.repository.MealSearchRepository

class MealSearchRepistoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchAPI.getSearchMealList(s)
    }
}