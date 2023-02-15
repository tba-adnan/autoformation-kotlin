abstract class Tertiary {
    abstract val schoolname : String
    abstract val cityname: String
}


class City: Tertiary() {
    override val schoolname = "Solicode"
    override val cityname = "Tangier"
    init {
        println("School name is $schoolname in City: $cityname ")
    }
}

