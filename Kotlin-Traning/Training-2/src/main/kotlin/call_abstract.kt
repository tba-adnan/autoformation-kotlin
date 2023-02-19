import training_abstract

class call_abstract: training_abstract() {
 override val abstractClassName = "success! : override one!"
 init {
     println(abstractClassName)
 }

}

class call_abstract_two: training_abstract() {
 override val abstractClassName = "success! : override two!"
 init {
     println(abstractClassName)
 }
}