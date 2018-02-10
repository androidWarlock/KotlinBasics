package oop

fun Int.isEven() = this%2 ==0
fun Country.isLarge() = this.area > 1000

fun main(args: Array<String>) {
    println(5.isEven())

    val ismailia = Country("Egypt",10000)

    println(ismailia.isLarge())
}