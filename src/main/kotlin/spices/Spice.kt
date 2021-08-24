package spices

abstract class Spice {
    abstract val spiceName: String
}

class Cinnamon(): Spice() {
    override val spiceName: String
        get() = TODO("Not yet implemented")
}

class Cloves(): Spice() {
    override val spiceName: String
        get() = TODO("Not yet implemented")
}