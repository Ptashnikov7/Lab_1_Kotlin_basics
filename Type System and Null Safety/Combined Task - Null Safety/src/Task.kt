fun generateGreeting(name: String?): String {
    val finalName = if (name != null && name.isNotEmpty()) name else "Guest"
    return "Welcome, $finalName!"
}