fun main() {
    print("Enter n of lines : ")
    val rows = readln().toInt()
    for (i in 1..rows) {
        println(" ".repeat(rows - i) + "*".repeat(2 * i - 1))
    }
}
