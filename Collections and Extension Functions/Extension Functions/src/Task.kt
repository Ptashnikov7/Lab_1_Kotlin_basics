// Используем ключевое слово this, чтобы обратиться к самой строке
fun String.removeSpaces(): String {
    return this.replace(" ", "")
}