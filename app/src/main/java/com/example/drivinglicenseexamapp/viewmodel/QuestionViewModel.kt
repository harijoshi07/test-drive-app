package com.example.drivinglicenseexamapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.drivinglicenseexamapp.data.model.Question
import com.example.drivinglicenseexamapp.data.questions.getBikeQuestionsA
import com.example.drivinglicenseexamapp.data.questions.getBikeQuestionsB
import com.example.drivinglicenseexamapp.data.questions.getBikeQuestionsC
import com.example.drivinglicenseexamapp.data.questions.getBikeQuestionsD
import com.example.drivinglicenseexamapp.data.questions.getBikeQuestionsE
import com.example.drivinglicenseexamapp.data.questions.getCarQuestionsA
import com.example.drivinglicenseexamapp.data.questions.getCarQuestionsB
import com.example.drivinglicenseexamapp.data.questions.getCarQuestionsC
import com.example.drivinglicenseexamapp.data.questions.getCarQuestionsD
import com.example.drivinglicenseexamapp.data.questions.getCarQuestionsE
import com.example.drivinglicenseexamapp.data.questions.getCommonQuestions

class QuestionViewModel: ViewModel(){

    private val bikeCategoryQuestions = mapOf(
        "सवारी सञ्चालन" to getBikeQuestionsA(),
        "सवारी कानुन" to getBikeQuestionsB(),
        "प्राविधिक ज्ञान" to getBikeQuestionsC(),
        "वातावरण प्रदूषण" to getBikeQuestionsD(),
        "दुर्घटना सचेतना" to getBikeQuestionsE(),
        "ट्राफिक संकेत" to getCommonQuestions()
    )

    // Get list of questions by category
    fun getBikeQuestionsByCategory(categoryTitle: String): List<Question> {
        return bikeCategoryQuestions[categoryTitle] ?: emptyList()
    }

    fun getBikeQuizQuestions(): List<Question> {

        val questionDistribution = mapOf(
            "सवारी सञ्चालन" to 6,
            "सवारी कानुन" to 5,
            "प्राविधिक ज्ञान" to 3,
            "वातावरण प्रदूषण" to 2,
            "दुर्घटना सचेतना" to 3,
            "ट्राफिक संकेत" to 6
        )

        // Collect and shuffle questions
        return questionDistribution.flatMap { (category, count) ->
            bikeCategoryQuestions[category]
                ?.shuffled()
                ?.take(count)
                ?: emptyList()
        }
    }



    private val carCategoryQuestions = mapOf(
        "सवारी सञ्चालन" to getCarQuestionsA(),
        "सवारी कानुन" to getCarQuestionsB(),
        "प्राविधिक ज्ञान" to getCarQuestionsC(),
        "वातावरण प्रदूषण" to getCarQuestionsD(),
        "दुर्घटना सचेतना" to getCarQuestionsE(),
        "ट्राफिक संकेत" to getCommonQuestions()
    )



    fun getCarQuestionsByCategory(categoryTitle: String): List<Question> {
        return carCategoryQuestions[categoryTitle] ?: emptyList()
    }



    fun getCarQuizQuestions(): List<Question> {

        val questionDistribution = mapOf(
            "सवारी सञ्चालन" to 6,
            "सवारी कानुन" to 5,
            "प्राविधिक ज्ञान" to 3,
            "वातावरण प्रदूषण" to 2,
            "दुर्घटना सचेतना" to 3,
            "ट्राफिक संकेत" to 6
        )

        // Collect and shuffle questions
        return questionDistribution.flatMap { (category, count) ->
            carCategoryQuestions[category]
                ?.shuffled()
                ?.take(count)
                ?: emptyList()
        }
    }

}