package Aquarium

import sun.security.util.Length

class Spice(val name: String = "cummin", var spiciness: String = "mild" ) {

    val heat: Int
    get() {return 5}


}

class BuildAquarium(var length: Int = 100, var width: Int = 20, var height:Int = 40){

    var volume: Int
    get() =width * height * length /1000
    set(value) {height = (value*1000) / (width*length)}

    var water = volume * .9

    constructor(numberOfFish: Int): this() {}
}

fun main() {
    val spice = Spice()
    println("${spice.name} ${spice.heat}")

    val user = User(name="Rekhin", 32);
    val user1 = User("",age=30)
    println("Name = ${user.name}, Age = ${user.age}")
}

class User(name: String, val age: Int) {

    val name: String
    init {
      /*  if(name.isBlank()) {
            this.name = "No Name"
        }else
            this.name = name.trim()*/
        this.name = if (name.isBlank()) "No Name" else name.trim()
        println("New user crated, Name: ${this.name}, Age: $age")
    }
}