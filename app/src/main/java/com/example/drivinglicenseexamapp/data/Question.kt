package com.example.drivinglicenseexamapp.data

data class Question(
    val questionText: String, // The question text in Nepali
    val optionA: String, // Option A
    val optionB: String, // Option B
    val optionC: String, // Option C
    val optionD: String, // Option D
    val correctOptionIndex: Int // The correct answer (could be A, B, C, or D)
)