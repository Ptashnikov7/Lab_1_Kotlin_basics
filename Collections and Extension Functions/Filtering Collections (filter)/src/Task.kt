fun getNumbersGreaterThanTen(numbers: List<Int>): List<Int> {
    // Залишаємо лише числа, які строго більше 10
    return numbers.filter { it > 10 }
}