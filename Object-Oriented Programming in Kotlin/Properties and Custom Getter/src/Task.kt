class Circle(val radius: Double) {
    // Объявляем свойство area с кастомным геттером
    val area: Double
        get() = 3.14 * radius * radius
}