package com.example.drivinglicenseexamapp.data.model

import com.example.drivinglicenseexamapp.R

data class Category(
    val title: String,
    val noOfQuestions: String,
    val painterId: Int
)


val itemCategory = listOf(
    Category(title = "सवारी सञ्चालन", noOfQuestions = "130 questions", painterId = R.drawable.drive),
    Category(title = "सवारी कानुन", noOfQuestions = "90 questions", painterId = R.drawable.law_rules),
    Category(title = "प्राविधिक ज्ञान", noOfQuestions = "80 questions", painterId = R.drawable.repair1),
    Category(title = "वातावरण प्रदूषण", noOfQuestions = "30 questions", painterId = R.drawable.pollution),
    Category(title = "दुर्घटना सचेतना", noOfQuestions = "60 questions", painterId = R.drawable.accident),
    Category(title = "ट्राफिक संकेत", noOfQuestions = "110 questions", painterId = R.drawable.traffic_rules)
)