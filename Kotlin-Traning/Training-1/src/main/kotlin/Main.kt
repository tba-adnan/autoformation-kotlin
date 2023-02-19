fun main() {
    training("adnane")
    TrainingTwo("tebbaa")

}

fun training(name: String) {
    println("Name : $name")
    val listofnames = listOf("adnane","amjad","Haitam")
    for (name in listofnames) {
        println(name)
    }
}

fun TrainingTwo(nickname: String) {
   val check =  when (nickname) {
        is String -> "it's a string"
        else -> "error!"
    }
    println(check)
}