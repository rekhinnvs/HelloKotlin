package freeCode

fun main() {
    var names = arrayOf("Rekhin", "Shambu", "Sreyas", "KP")

    names.forEach {it:String ->
    println(it)}

    names.forEach { name -> println(name) }

    names.forEachIndexed {index, name ->
        println("$name is at index $index")
    }

    //Key value pair
    val map = mapOf<Int,String>(1 to "a", 2 to "b", 3 to "c")
    map.forEach{ (key, value) -> println("$key -> $value")}

    sayHello("Hi","Rekhin", "KP", "Shambu")

    greetPerson(name="Rekhin", greeting = "Hello")
}

fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { name ->
        println("$greeting $name") }
}

fun greetPerson(greeting:String, name:String) = println("$greeting $name")