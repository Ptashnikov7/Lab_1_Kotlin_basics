// Добавляем ключевое слово data перед классом
data class User(val login: String, val id: Int)

fun compareUsers(): Boolean {
    val user1 = User(login = "admin", id = 1)
    val user2 = User(login = "admin", id = 1)
    // Теперь это вернет true, так как данные внутри объектов одинаковые
    return user1 == user2
}