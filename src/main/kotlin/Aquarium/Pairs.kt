package Aquarium

class Pairs() {

    val equipment = "fishnet" to "catch fish"
    fun findEquipment() {
       val equipment = "fishnet" to "catch fish"

        //find the first element in th pair
       println(equipment.first)

       val (tool,use) = equipment
        println("The $tool is for $use")

    }

    fun multipairs() {
        var equipment = "fishnet" to "catch fish" to "of big size" to "and strong"
        println(equipment)

        //equipment = ("fishnet" to "catch fish") to ("of big size" to "and strong")
    }

    fun pairsInFunction(): Pair<String,String> {
        return ("fishnet" to "catching")
    }

}

class Books(val title: String, val author: String, val year: String) {

    fun returnBook(): Pair<String, String> {

        return(title to author)
    }

    fun fullBookDetails(): Triple<String, String, String> {
        return Triple(title, author, year)
    }
}


fun main() {
    val pairs = Pairs()
    pairs.findEquipment()

    pairs.multipairs()

    //Return a pair from a function
    val(tool, use) = pairs.pairsInFunction()
    println(tool)

    //Instance for the book class
    var books = Books("x","y","z")
    var(title, author) = books.returnBook()

    //Print the title and author
    println("Here is your book $title written by $author ")

    //get triple values
    val bookTitleYear = books.fullBookDetails()

    println("Here is your book ${bookTitleYear.first} written by ${bookTitleYear.second} in the year ${bookTitleYear.third} ")
}