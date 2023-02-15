import  Child_class
import Grandchildren
import City
import Mainclass

fun main() {
    var name: String = "oop 2"
    name.uppercase().also(::println)
    val primary = Child_class()
    val secondary = Grandchildren()
    val tertiary = City()
    val Quateriary = Mainclass("adnane", "tebbaa")
}