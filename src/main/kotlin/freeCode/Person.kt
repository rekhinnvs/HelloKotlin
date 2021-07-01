package freeCode

class Person (_firstName: String, _lastName:String) {
    val firstName: String = _firstName
    val lastName: String = _lastName
    var nickName: String? = null
    set(value) {
        field = value;
        println("Nick name is updated.")
    }
    get() {
        println("The return value is $field from getter")
        return  field
    }

/*    init {
        firstName = _firstName
        lastName = _lastName
    }*/

    fun printInfo() {
        //Check wether nickname is null
        val nickNameToPrint = nickName?: "no nickName"

        println("$firstName ($nickNameToPrint) $lastName")
    }
}