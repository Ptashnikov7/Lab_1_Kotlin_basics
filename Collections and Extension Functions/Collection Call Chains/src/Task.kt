fun processData(numbers: List<Int>): List<Int> {
    // Спочатку фільтруємо додатні, потім множимо їх на 2
    return numbers.filter { it > 0 }
        .map { it * 2 }
}