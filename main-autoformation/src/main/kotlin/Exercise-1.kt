fun main() {
    print("Nombre des étoiles: ")
    val rows = readLine()!!.toInt()
    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
