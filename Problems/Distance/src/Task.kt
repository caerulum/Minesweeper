import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val distance = scanner.nextDouble()
    val hours = scanner.nextDouble()
    println(distance / hours)
}