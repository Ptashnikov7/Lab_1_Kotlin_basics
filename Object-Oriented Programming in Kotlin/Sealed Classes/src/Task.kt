// Объявляем изолированный класс
sealed class NetworkResult

// Создаем подклассы, которые наследуются от NetworkResult
data class Success(val data: String) : NetworkResult()
data class Error(val errorMsg: String) : NetworkResult()