fun List<String>.getImportantWords(): List<String> {
    // 1. Фільтруємо слова на букву "K"
    // 2. Переводимо їх у верхній регістр
    return this.filter { it.startsWith("K") }
        .map { it.uppercase() }
}