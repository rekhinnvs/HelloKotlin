package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color: String
        get() = "gray"

    override fun eat() {
        println("Hunt and eat fishes")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color: String
        get() = "gold"

    override fun eat() {
        println("Munch and algae")
    }
}

interface FishAction {
    fun eat()
}

fun main() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color}, Plecostomus: ${plecostomus.color}")
    //println("Shark eat: ${shark.eat()}\nPlecostomus eat: ${plecostomus.eat()}")
    shark.eat()
    plecostomus.eat()
}