package oop

//the java look alike way
class Country(name: String , area: Int){
    var name: String
    var area: Int

    init {
        this.name = name
        this.area =area
    }

}

//the kotlin way
class governorate(val name: String ,  val area: Int) {

    constructor(name: String): this(name,0){
        println("constructor called")
    }

}

//the even better kotlin way using default value params
private class Street(val name: String ="",  val width: Int =0 )

fun main(args: Array<String>) {
    var street = Street()
    street = Street("mystreet")
    street = Street(width = 0)

}