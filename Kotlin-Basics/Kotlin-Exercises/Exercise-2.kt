val mylist = arrayListOf<String>("demo0","demo1","demo2")

fun main() {
    println("""
                                 ___ 
  _____ _____ _ _ __(_)___ ___  |_  )
 / -_) \ / -_) '_/ _| (_-</ -_)  / / 
 \___/_\_\___|_| \__|_/__/\___| /___|
                          réaliser par Adnane Tebbaa.           
""".trimIndent())
    println("")
    println("[>] current list : $mylist")
    print("[+] select display, add, delete (di/ad/de) > ")
    val user = readln()
    if (user == "di") {
        display()
    }
    if (user == "de") {
        print("[-] delete > ")
        val de_element = readln()
        delete(de_element)
    }
    if (user == "ad") {
        print("[+] add element > ")
        val ad_element = readln()
        add(ad_element)
    }

}


fun display() {
    println("[>] current list : $mylist")
}

fun delete(input: String) {
    mylist.remove("$input")
    println("[>] current list: $mylist")
}

fun add(add: String) {
    mylist.add("$add")
    println("[>] current list : $mylist")
}
