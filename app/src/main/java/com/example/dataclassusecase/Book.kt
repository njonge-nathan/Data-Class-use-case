package com.example.dataclassusecase

data class Book(
    val name: String,
    val author: String
)

val listOfBooks = listOf(

    Book(
        name = "Atomic Habits",
        author = "James Clear"
    ),
    Book(
        name = "Think & Grow Rich",
        author = "Napoleon Hill"
    ),
    Book(
        name = "Rich Dad Poor Dad",
        author = "Robert T. Kiyosaki"
    ),
    Book(
        name = "The Psychology Of Money",
        author = "Morgan Housel"
    ),

)