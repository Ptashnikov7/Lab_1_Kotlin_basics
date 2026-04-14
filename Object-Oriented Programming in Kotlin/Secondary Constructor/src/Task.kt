class Rectangle(val width: Int, val height: Int) {
    // Вторичный конструктор для создания квадрата
    constructor(size: Int) : this(size, size)
}

fun createSquare(): Int {
    val square = Rectangle(5)
    return square.width * square.height
}