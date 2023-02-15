import School
import Classroom
import Monitor
import Computer
import Locker
import Door


fun main() {
    val initial = School()
    val classroom = Classroom("adnane", 18)
    val monitor = Monitor(100, 70)
    val computer = Computer(13)
    val locker = Locker("name", "tebbaa")
    val door = Door()
    initial.main()
    initial.room(3)
    classroom.main()
}