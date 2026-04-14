fun getWordLengths(words: List<String>): List<Int> {
    // Перетворюємо кожне слово на його довжину
    return words.map { it.length }
}