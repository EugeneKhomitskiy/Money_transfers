import kotlin.math.roundToInt

const val RATE = 0.0075

fun main() {
    while (true) {
        println("Введите сумму перевода в рублях:")
        val amount = readLine()!!.toInt()
        val commission = amount * RATE
        val result = (commission * 100.00).roundToInt() /100.00
        val str = result.toString().split(".").toTypedArray()
        val a = str[0]
        val b = str[1]
        println("Комиссия равна: $a руб. $b коп.")
    }
}