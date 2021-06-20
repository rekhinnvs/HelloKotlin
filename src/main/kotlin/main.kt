import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    dayOfWeek()
}

fun dayOfWeek() {
    print("What day is it today : ")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday")
        else -> println("Some other day")
    }
    val temp = 10
    println("You are ${if(temp > 10) "Fried" else "Safe"}")
}