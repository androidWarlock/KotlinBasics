package functional

fun main(args: Array<String>) {
    val timesTwo = {x:Int -> x*2}

    val add:(Int,Int) -> Int = {x:Int,y:Int -> x+y}

    val list = (1..10).toList()
    val filteredList = list.filter { element -> element%2==0 } //lambdas
    val filteredList2 = list.filter { it%2==0 } //lambdas + it
    val filteredList3 = list.filter { it.even()} //lambdas + it + extension
    val filteredList4 = list.filter(::isEven) //lambdas + extension

    println(list)
    println(filteredList)
    println(filteredList2)
    println(filteredList3)
    println(filteredList4)


}

fun isEven(i:Int) = i%2==0

fun Int.even() = this %2 ==0