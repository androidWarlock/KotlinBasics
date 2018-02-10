package oop

//data class creates these methods by default: hashcode() , equals() , toString() , Copy() and destructing operator
data class Address(val name: String , val number: Int )


fun main(args: Array<String>) {
    val myAdrress = Address("main Street" , 44)
    val myAdrress2 = Address("main Street" , 44)

    println(myAdrress.hashCode())


    //refrence equality
    println(myAdrress === myAdrress2)

    //structural equality (same as equals())
    println(myAdrress == myAdrress2)
    println(myAdrress.equals(myAdrress2))

    //toString
    println(myAdrress)

    //copy and yet you can change any param
    println(myAdrress.copy(number = 55))


    //destructing operator
    val (name , number) = myAdrress
    println("$name  , $number")


}