fun main() {
    var name: String = "adnane"
    var nickname: String = "tebbaa"
    var age: Int = 20
    val changable: String = "this is a changable variable."
    println("my name is $name $nickname, and my age is $age years old.")
    println(">>> $changable")

    val count_one: Int = 20
    val count_two: Int = 9

    if (count_two > count_one)   {
        println("$count_two wins!!!")
    } else{
        println("check!")

    }

 demo()
}

fun demo() {
    var score: Int = 100

    val list = listOf<String>("adnane", "demo_one", "demo_two")
    when (score) {
        0 -> print("you loose!")
        100 -> ("you win!")
        else -> println("This is a test!")
    }



}