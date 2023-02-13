fun main() {
    println("Enter n of lines : ")
    val rows = readln().toInt()
    for (star in 1..rows) {
        println(" ".repeat(rows - star) + "*".repeat(2 * star - 1))
    }
}
