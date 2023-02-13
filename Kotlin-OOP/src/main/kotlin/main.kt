import School
import Classroom
import Monitor
fun main() {
    val initial = School()
    val classroom = Classroom("adnane", 18)
    val monitor = Monitor(100, 70)
    initial.main()
    initial.room(3)
    classroom.main()
}