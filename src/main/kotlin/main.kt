import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    var value = args[0].toInt()

    //dayOfWeek()
    //greetings(value)
    //feedTheFish()
    println(getFortuneCookie())
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

fun greetings(value:Int) {
    when(value) {
        in 1..11 -> println("Good morning Kotlin")
        else -> println("Good night Kotlin")
    }
}

fun getRandomDay(): String {
    val days = listOf<String>("Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday")
    return days[Random().nextInt(7)]
}

fun feedTheFish() {
    val day = getRandomDay()
    println("Today is $day")
}

fun getFortuneCookie() :String{
    val fortune = listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter you birthday : ")
    val birthday = readLine()?.toIntOrNull()
    val fortuneNumber : Int = birthday?.mod(7) ?: 1
    return fortune[fortuneNumber]
}