fun main() {
    println("Main start.")
    demo()

}

val list = listOf("adnane", "haitam","amjad", "xc020")
fun demo() {
    println(list)
    var filter = (list.filter { it[2] == 'j' })
    println("the name is $filter")
}