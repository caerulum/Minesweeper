import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextDouble()
    println(x.pow(3) + x.pow(2) + x + 1)
}