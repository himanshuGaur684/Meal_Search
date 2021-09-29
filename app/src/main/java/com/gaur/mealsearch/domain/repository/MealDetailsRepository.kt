package com.gaur.mealsearch.domain.repository

import com.gaur.mealsearch.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String):MealsDTO

}