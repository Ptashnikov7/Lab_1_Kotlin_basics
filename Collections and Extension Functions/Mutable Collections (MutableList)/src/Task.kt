fun createMutableList(): MutableList<Int> {
    // Создаем изменяемый список с 1 и 2
    val list = mutableListOf(1, 2)
    // Добавляем 3
    list.add(3)
    return list
}