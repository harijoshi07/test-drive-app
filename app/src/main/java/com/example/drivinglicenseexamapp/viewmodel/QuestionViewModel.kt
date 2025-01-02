package com.example.drivinglicenseexamapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.data.getCarQuestionsA
import com.example.drivinglicenseexamapp.data.getCarQuestionsB
import com.example.drivinglicenseexamapp.data.getCarQuestionsC
import com.example.drivinglicenseexamapp.data.getCarQuestionsD
import com.example.drivinglicenseexamapp.data.getCarQuestionsE
import com.example.drivinglicenseexamapp.data.getSampleQuestions
import com.example.drivinglicenseexamapp.data.getSampleQuestions2
import com.example.drivinglicenseexamapp.data.getSampleQuestions3
import com.example.drivinglicenseexamapp.data.getSampleQuestions4
import com.example.drivinglicenseexamapp.data.getSampleQuestions5
import com.example.drivinglicenseexamapp.data.getSampleQuestions6

class QuestionViewModel: ViewModel(){

    private val bikeCategoryQuestions = mapOf(
        "सवारी सञ्चालन" to getSampleQuestions(),
        "सवारी कानुन" to getSampleQuestions2(),
        "प्राविधिक ज्ञान" to getSampleQuestions3(),
        "वातावरण प्रदूषण" to getSampleQuestions4(),
        "दुर्घटना सचेतना" to getSampleQuestions5(),
        "ट्राफिक संकेत" to getSampleQuestions6()
    )

    // Get all questions by category
    fun getBikeQuestionsByCategory(categoryTitle: String): List<Question> {
        return bikeCategoryQuestions[categoryTitle] ?: emptyList()
    }

    fun getBikeQuizQuestions(): List<Question> {
        // Specify the number of questions from each category
        val questionDistribution = mapOf(
            "सवारी सञ्चालन" to 6,
            "सवारी कानुन" to 5,
            "प्राविधिक ज्ञान" to 3,
            "वातावरण प्रदूषण" to 2,
            "दुर्घटना सचेतना" to 3,
            "ट्राफिक संकेत" to 6
        )

        // Collect and shuffle questions from each category
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
        "ट्राफिक संकेत" to getSampleQuestions6()
    )



    fun getCarQuestionsByCategory(categoryTitle: String): List<Question> {
        return carCategoryQuestions[categoryTitle] ?: emptyList()
    }



    fun getCarQuizQuestions(): List<Question> {
        // Specify the number of questions from each category
        val questionDistribution = mapOf(
            "सवारी सञ्चालन" to 6,
            "सवारी कानुन" to 5,
            "प्राविधिक ज्ञान" to 3,
            "वातावरण प्रदूषण" to 2,
            "दुर्घटना सचेतना" to 3,
            "ट्राफिक संकेत" to 6
        )

        // Collect and shuffle questions from each category
        return questionDistribution.flatMap { (category, count) ->
            carCategoryQuestions[category]
                ?.shuffled()
                ?.take(count)
                ?: emptyList()
        }
    }

}