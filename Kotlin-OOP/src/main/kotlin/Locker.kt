
open class Locker(var name:String, var nickname:String) {
    open var fullname: String
        get() = "test"
        set(value) {
            name = (value)
        }
    init {
        println("open class : my name is $name, $fullname")
    }



}