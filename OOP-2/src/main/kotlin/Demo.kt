import com.sun.tools.javac.Main

open class Main_class () {

    open val name: String = "adnane"
}
class Child_class : Main_class() {
    override val name: String = "haitam"

    fun main(name: String) {
        println("(inheritance :: Current name.)")
        name.uppercase().also(::println)
    }

    init {
        main(name)
    }
}


class Grandchildren: Main_class() {
     init {
         var nickname:String = "adnane".uppercase().also(::println)
     }

}

