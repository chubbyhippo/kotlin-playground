package com.example.collections

fun main() {
    val names = listOf("Hippo", "Giraffe", "Kangaroo")
    println("names = $names")

    val namesMutableList = mutableListOf("Hippo", "Giraffe", "Kangaroo")
    println("namesMutableList = $namesMutableList")
    namesMutableList.add("Wombat")
    println("namesMutableList = $namesMutableList")


    val set = setOf("Hippo", "Giraffe", "Kangaroo")
    println("set = $set")
}
