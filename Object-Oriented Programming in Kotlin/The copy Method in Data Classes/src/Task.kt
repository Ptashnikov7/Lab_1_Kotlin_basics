data class Book(val title: String, val author: String, val price: Int)

fun applyDiscount(book: Book): Book {
    // Создаем копию книги с новой ценой 150
    return book.copy(price = 150)
}