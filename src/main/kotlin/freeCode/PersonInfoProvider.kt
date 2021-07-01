package freeCode

interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }

}

open class  BasicInfoProvider: PersonInfoProvider {

    override val providerInfo: String
        get() = "Basic info provider"

    override fun printInfo(person: Person) {
        println("Print info from class")
        super.printInfo(person)
        //println("First name: ${person.firstName}, Last name: ${person.lastName}")
        //person.printInfo()
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person("Rekhin","NV"))
}