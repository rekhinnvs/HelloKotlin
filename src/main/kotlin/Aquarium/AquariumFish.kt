package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish() {
    override val color: String
        get() = "gray"
}

class Plecostomus: AquariumFish() {
    override val color: String
        get() = "gold"
}

fun main() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color}, Plecostomus: ${plecostomus.color}")
}