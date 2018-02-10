package oop

class Empty //just like java

 class City{
    var name: String = ""
    get() {return field}
    set(value) {field = value }


    var population: Int = 0


    fun tostring() : String {
        return  name+ " "+ population
    }
}

fun main(args: Array<String>) {
    val empty = Empty() //no new keyword like java

    val berlin = City()
    berlin.name = "Berlin"
    berlin.population= 3500_000

    println(berlin.tostring())
}