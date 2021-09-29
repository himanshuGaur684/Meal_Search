package com.gaur.mealsearch.presentation.meal_search

import com.gaur.mealsearch.domain.model.Meal

data class MealSearchState(
    val isLoading: Boolean = false,
    val data: List<Meal>? = null,
    val error: String = ""
)