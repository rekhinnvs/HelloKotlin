package Aquarium

open class Book(var title: String, var author: String) {

    private var currentPage: Int = 0
    open fun readPage() {
        currentPage ++

    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title,author) {
    private  var wordsRead = 0
    override fun readPage() {
        wordsRead += 250
        println("Author: ${author}\ntitle: ${title}\nNumber of words read: $wordsRead")
    }
}

class Person(val name: String, val age: Int) {

    var nickName: String? = null
        set(value) {
            field = value
        }
        get() {
            println("Nick name: $field")
            return  field
        }
    init {
        println("From first init block")
    }
}

fun main() {
    var books = eBook("The fire", "KP")
    books.readPage()
    var person = Person("Rekhin",32)
    person.nickName = "Ser"
    println(person.nickName)

    var names: String? = "Hello"
    println(names ?: "No Name")
}

