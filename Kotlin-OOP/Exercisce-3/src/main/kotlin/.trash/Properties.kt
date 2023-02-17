import Operations
abstract class Properties: Operations {
    val mylist = arrayListOf<String>("produit0","produit1","produit2")
    override fun afficher() {
        println("[>] current list: $mylist")
    }
    override fun ajouter() {
        mylist.add("demox")
        println("[>] current list: $mylist")
    }
    override fun supprimer() {
        mylist.remove("demox")
        println("[>] current list: $mylist")
    }

}