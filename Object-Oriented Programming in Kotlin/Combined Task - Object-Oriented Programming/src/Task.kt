class Worker(val name: String, val hourlyRate: Int) {

    init {
        // 1. Проверяем почасовую ставку
        if (hourlyRate <= 0) {
            throw IllegalArgumentException("Hourly rate must be greater than 0")
        }
    }

    // 2. Свойство с кастомным сеттером
    var hoursWorked: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    // 3. Расчетное свойство (только геттер)
    val salary: Int
        get() = hourlyRate * hoursWorked
}