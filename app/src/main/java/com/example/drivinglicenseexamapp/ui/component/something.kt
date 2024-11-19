package com.example.drivinglicenseexamapp.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SegmentedButton(modifier: Modifier = Modifier) {

    val checkedList = remember { mutableStateListOf<Int>() }
    val options = listOf("StudyMode", "Exam Mode")

    MultiChoiceSegmentedButtonRow {
        options.forEachIndexed { index, label ->
            SegmentedButton(
                shape = SegmentedButtonDefaults.itemShape(index = index, count = options.size),
                onCheckedChange = {
                    if (index in checkedList) {
                        checkedList.remove(index)
                    } else {
                        checkedList.add(index)
                    }
                },
                checked = index in checkedList
            ) {
                Text(label)
            }
        }
    }

}

@Preview
@Composable
fun SegmentedButtonPreview(modifier: Modifier = Modifier) {
    SegmentedButton()
}