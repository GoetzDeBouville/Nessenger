package com.example.nessenger.colorRandomizer

import kotlin.random.Random

fun randomiseColor(): String {
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)
    return String.format("#%02X%02X%02X", red, green, blue)
}