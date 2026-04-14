fun List<Int>.sumOdd(): Int {
    var sum = 0
    // Цикл for по элементам списка (this)
    for (item in this) {
        if (item % 2 != 0) { // Проверка на нечетность
            sum += item
        }
    }
    return sum
}