package com.example.drivinglicenseexamapp.ui.component

inline fun <T> List<T>.countIndexed(predicate: (index: Int, T) -> Boolean): Int {
    var count = 0
    for (index in indices) {
        if (predicate(index, this[index])) count++
    }
    return count
}
