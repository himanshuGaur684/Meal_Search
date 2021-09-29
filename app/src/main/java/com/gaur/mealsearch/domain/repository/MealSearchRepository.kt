package com.gaur.mealsearch.domain.repository

import com.gaur.mealsearch.data.model.MealsDTO
import com.gaur.mealsearch.domain.model.Meal

interface MealSearchRepository {

    suspend fun getMealSearch(s:String): MealsDTO



}