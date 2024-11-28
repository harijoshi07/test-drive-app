package com.example.drivinglicenseexamapp

import androidx.lifecycle.ViewModel
import com.example.drivinglicenseexamapp.data.Question
import com.example.drivinglicenseexamapp.data.getSampleQuestions
import com.example.drivinglicenseexamapp.data.getSampleQuestions2
import com.example.drivinglicenseexamapp.data.getSampleQuestions3
import com.example.drivinglicenseexamapp.data.getSampleQuestions4
import com.example.drivinglicenseexamapp.data.getSampleQuestions5
import com.example.drivinglicenseexamapp.data.getSampleQuestions6

class QuestionViewModel: ViewModel(){

    private val categoryQuestions = mapOf(
        "सवारी सञ्चालन" to getSampleQuestions(),
        "सवारी कानुन" to getSampleQuestions2(),
        "प्राविधिक ज्ञान" to getSampleQuestions3(),
        "वातावरण प्रदूषण" to getSampleQuestions4(),
        "दुर्घटना सचेतना" to getSampleQuestions5(),
        "ट्राफिक संकेत" to getSampleQuestions6()
    )

    // Get all questions by category
    fun getQuestionsByCategory(categoryTitle: String): List<Question> {
        return categoryQuestions[categoryTitle] ?: emptyList()
    }

    fun getQuizQuestions(): List<Question> {
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
            categoryQuestions[category]
                ?.shuffled()
                ?.take(count)
                ?: emptyList()
        }
    }
}