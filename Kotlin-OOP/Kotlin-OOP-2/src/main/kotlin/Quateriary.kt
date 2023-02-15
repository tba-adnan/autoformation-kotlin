
interface Quateriary {
    fun displayyes()
    fun disyplayno()
}
abstract class Run() {
    abstract var name: String
    abstract var nickname: String
}

class Mainclass(name:String,nickname:String ): Quateriary, Run() {
    override var name: String = name
    override var nickname: String = nickname

    override fun displayyes() {
        println("Name $name - Nickname $nickname")
    }
    override fun disyplayno() {
        println("No display")
    }

}