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
        "Category1" to getSampleQuestions(),
        "Category2" to getSampleQuestions2(),
        "Category3" to getSampleQuestions3(),
        "Category4" to getSampleQuestions4(),
        "Category5" to getSampleQuestions5(),
        "Category6" to getSampleQuestions6()
    )

    // Get all questions by category
    fun getQuestionsByCategory(category: String): List<Question> {
        return categoryQuestions[category] ?: emptyList()
    }

    // Get all questions for the quiz mode
    fun getAllQuestions(): List<Question> {
        return categoryQuestions.values.flatten()
    }
}