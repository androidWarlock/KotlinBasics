package oop

abstract class Vechile{
    abstract fun drive()
}

class Bycicle : Vechile(){
    override fun drive() {
        "driving bycicle"
    }
    fun bycicle() ="hello"

}


class Boat : Vechile(){
    override fun drive() {
        "driving boat"
    }

    fun boat() ="hello"
}

fun main(args: Array<String>) {
    val vechile: Vechile = Bycicle()
    vechile.drive()

    if (vechile is Bycicle ){
        vechile.bycicle()
    }
}