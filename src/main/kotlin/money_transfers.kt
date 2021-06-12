import kotlin.math.roundToInt

const val RATE = 0.75

fun main() {
    while (true) {
        println("Введите сумму перевода в рублях:")
        val amount = readLine()!!.toInt()
        val commission = (amount * RATE).roundToInt()
        val result = if (commission <= 3500) 3500 else commission
        println("Комиссия равна: $result коп.")
    }
}