package com.gaur.mealsearch.data.model

import com.gaur.mealsearch.domain.model.Meal
import com.gaur.mealsearch.domain.model.MealDetails

data class MealDTO(
    val dateModified: String?,
    val idMeal: String,
    val strArea: String?,
    val strCategory: String?,
    val strCreativeCommonsConfirmed: String?,
    val strDrinkAlternate: String?,
    val strImageSource: String?,
    val strIngredient1: String?,
    val strIngredient10: String?,
    val strIngredient11: String?,
    val strIngredient12: String?,
    val strIngredient13: String?,
    val strIngredient14: String?,
    val strIngredient15: String?,
    val strIngredient16: String?,
    val strIngredient17: String?,
    val strIngredient18: String?,
    val strIngredient19: String?,
    val strIngredient2: String?,
    val strIngredient20: String?,
    val strIngredient3: String?,
    val strIngredient4: String?,
    val strIngredient5: String?,
    val strIngredient6: String?,
    val strIngredient7: String?,
    val strIngredient8: String?,
    val strIngredient9: String?,
    val strInstructions: String?,
    val strMeal: String?,
    val strMealThumb: String?,
    val strMeasure1: String?,
    val strMeasure10: String?,
    val strMeasure11: String?,
    val strMeasure12: String?,
    val strMeasure13: String?,
    val strMeasure14: String?,
    val strMeasure15: String?,
    val strMeasure16: String?,
    val strMeasure17: String?,
    val strMeasure18: String?,
    val strMeasure19: String?,
    val strMeasure2: String?,
    val strMeasure20: String?,
    val strMeasure3: String?,
    val strMeasure4: String?,
    val strMeasure5: String?,
    val strMeasure6: String?,
    val strMeasure7: String?,
    val strMeasure8: String?,
    val strMeasure9: String?,
    val strSource: String?,
    val strTags: String?,
    val strYoutube: String?
)


fun MealDTO.toDomainMeal(): Meal {
    return Meal(
        id = this.idMeal,
        name = this.strMeal ?: "",
        image = this.strMealThumb ?: ""
    )
}


fun MealDTO.toDomainMealDetails(): MealDetails {
    return MealDetails(
        name = this.strMeal ?: "",
        image = this.strMealThumb ?: "",
        instructions = this.strInstructions ?: "",
        category = this.strCategory ?: "",


        ingredient1 = this.strIngredient1 ?: "",
        ingredient2 = this.strIngredient2 ?: "",
        ingredient3 = this.strIngredient3 ?: "",
        ingredient4 = this.strIngredient4 ?: "",
        ingredient5 = this.strIngredient5 ?: "",
        ingredient6 = this.strIngredient6 ?: "",
        ingredient7 = this.strIngredient7 ?: "",
        ingredient8 = this.strIngredient8 ?: "",
        ingredient9 = this.strIngredient9 ?: "",
        ingredient10 = this.strIngredient10 ?: "",
        ingredient11 = this.strIngredient11 ?: "",
        ingredient12 = this.strIngredient12 ?: "",
        ingredient13 = this.strIngredient13 ?: "",
        ingredient14 = this.strIngredient14 ?: "",
        ingredient15 = this.strIngredient15 ?: "",
        ingredient16 = this.strIngredient16 ?: "",
        ingredient17 = this.strIngredient17 ?: "",
        ingredient18 = this.strIngredient18 ?: "",
        ingredient19 = this.strIngredient19 ?: "",
        ingredient20 = this.strIngredient20 ?: "",

        measure1 = this.strMeasure1 ?: "",
        measure2 = this.strMeasure2 ?: "",
        measure3 = this.strMeasure3 ?: "",
        measure4 = this.strMeasure4 ?: "",
        measure5 = this.strMeasure5 ?: "",
        measure6 = this.strMeasure6 ?: "",
        measure7 = this.strMeasure7 ?: "",
        measure8 = this.strMeasure8 ?: "",
        measure9 = this.strMeasure9 ?: "",
        measure10 = this.strMeasure10 ?: "",
        measure11 = this.strMeasure11 ?: "",
        measure12 = this.strMeasure12 ?: "",
        measure13 = this.strMeasure13 ?: "",
        measure14 = this.strMeasure14 ?: "",
        measure15 = this.strMeasure15 ?: "",
        measure16 = this.strMeasure16 ?: "",
        measure17 = this.strMeasure17 ?: "",
        measure18 = this.strMeasure18 ?: "",
        measure19 = this.strMeasure19 ?: "",
        measure20 = this.strMeasure20 ?: "",

        )


}

