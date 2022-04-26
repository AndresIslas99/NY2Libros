package edu.itesm.nytimes



data class Results(
    var results: Books?
)

data class Books(
 //Completa aquí
    var books: List<Book>?
)


data class Book(val rank: Int,
                val title: String,
                val description: String,
                val book_image: String)

