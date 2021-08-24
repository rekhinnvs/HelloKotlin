package Aquarium

class Collections {

    fun lists() {
        val symptoms: MutableList<String> = mutableListOf("one","two","three","four")

        symptoms.add("five")
        println(symptoms)

    }
}

fun main() {
    val collections = Collections()

    //Print the contents in the list
    collections.lists()

}

