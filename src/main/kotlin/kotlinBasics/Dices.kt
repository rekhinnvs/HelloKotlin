package kotlinBasics

class Dices(val numberOfSides: Int, val diceColor: String) {

    fun roll(): Int {
        //val randomNumber = (1..numberOfSides).random() opitimizing the code.
        return (1..numberOfSides).random()
    }
}

fun main() {

    val myFirstDice = Dices(numberOfSides = 8, "red")
    val rollResult = myFirstDice.roll()
    println("Your ${myFirstDice.numberOfSides} sided ${myFirstDice.diceColor} dice rolled ${rollResult}!")
    val luckyNumber = 4
    when (rollResult) {
        luckyNumber -> {
            println("You win!")
        }
        1 -> {
            println("So sorry! You rolled a 1. Try again!")
        }
        2 -> {
            println("Sadly, you rolled a 2. Try again!")
        }
        3 -> {
            println("Unfortunately, you rolled a 3. Try again!")
        }
        5 -> {
            println("Don't cry! You rolled a 5. Try again!")
        }
        6 -> {
            println("Apologies! You rolled a 6. Try again!")
        }
        else -> {
            println("Nothing has worked out, try again!")
        }
    }



    val mySecondDice = Dices(numberOfSides = 12, "blue")
    println("Your ${mySecondDice.numberOfSides} sided ${mySecondDice.diceColor} dice rolled ${mySecondDice.roll()}!")
}