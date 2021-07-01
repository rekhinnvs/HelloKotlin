package freeCode

class FancyInfoProvider : BasicInfoProvider(){

    override val providerInfo: String
        get() = "Fancy Info Provider"
}


fun main() {
    var fancyInfoProvider = FancyInfoProvider()
    println(fancyInfoProvider.providerInfo)
}