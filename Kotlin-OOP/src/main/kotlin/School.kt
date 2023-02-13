class School {
    val student: String = "adnane"
    val teacher: String = "Fouad"
    fun demo(name: String) {
        println("it works!")
        println("the student name is $name")
    }

    fun room(number: Number) {
        println("go to classroom number $number")
    }

    fun main() {
        demo(student)
    }

}