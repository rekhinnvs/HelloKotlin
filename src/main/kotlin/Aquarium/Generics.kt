package Aquarium

class MyList<T> {

    fun get(pos: Int): T {
        TODO()
    }
    fun addItem(item: T) {}

}

fun main() {
    val intList: MyList<String>
    val fishList: MyList<String>

    loop@ for(i:Int in 1..100) {
        for(j:Int in 1..100) {
            println(i)
            if(i>10) break@loop
        }
    }
}