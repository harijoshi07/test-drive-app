package com.example.drivinglicenseexamapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Question(
    val questionText: String? = null, // The question text in Nepali
    val questionImageId: Int? = null, // The question text in Nepali
    val optionA: String, // Option A
    val optionB: String, // Option B
    val optionC: String, // Option C
    val optionD: String, // Option D
    val correctOptionIndex: Int // The correct answer (could be A, B, C, or D)
):Parcelable