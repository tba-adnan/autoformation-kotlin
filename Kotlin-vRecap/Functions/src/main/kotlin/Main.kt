fun main() {
 demo(nickname = "tebbaa")
    demo_two()
}

fun demo(name: String = "adnane", nickname:String) {
    println("Full name : $name $nickname")
}

// SIF : Single expression function
fun demo_two(var_one:String = "Single expression function"): String = "demo"