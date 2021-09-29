package com.gaur.mealsearch.presentation.meal_details

import com.gaur.mealsearch.domain.model.MealDetails

data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
) {
}