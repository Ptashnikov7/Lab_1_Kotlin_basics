fun getReadOnlyList(): List<String> {
    val list = mutableListOf("A", "B", "C")
    list.add("D")
    // Просто возвращаем его — Kotlin автоматически приведет MutableList к List
    return list
}