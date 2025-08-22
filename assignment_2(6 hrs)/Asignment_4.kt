
data class Book(val title: String, val author: String, val price: Double)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun showBooks() {
        println("Library Books:")
        for (book in books) {
            println("Title: ${book.title}, Author: ${book.author}, Price: $${book.price}")
        }
    }
}

fun main() {
    val library = Library()

    library.addBook(Book("The Alchemist", "Paulo Coelho", 299.0))
    library.addBook(Book("Atomic Habits", "James Clear", 499.0))
    library.addBook(Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.0))

    library.showBooks()
}
