import java.util.*

class FeedTheFish {
    fun mains(args: Array<String>) {
       print(feedTheFish())
    }

    fun getRandomDay(): String {
        val days = listOf<String>("Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday")
        return days[Random().nextInt(7)]
    }

    fun feedTheFish() {
        val day = getRandomDay()
        //println("Today is $day")
        fishFood(day)
    }

    fun fishFood(day : String) : String {
        return when(day) {
            "Monday" -> "Flakes"
            "Tuesday" -> "Redworms"
            "Wednesday" -> "Granules"
            "Thursday" -> "Mosquitos"
            "Friday" -> "Plankton"
            else -> "Fasting"
        }
    }
}