package basics

import java.util.*

val PI =3.1415
val list:MutableList<Int> = mutableListOf()

fun main(args: Array<String>){

    loadDataTolist()
    printLessThan10()
}

fun loadDataTolist(){

    for (i in 1..100)
    list.add(Random().nextInt(100)+1)

}

fun printLessThan10(){
    var i:Int =0
    while (list[i]>10){
        println(list[i])
        i++
    }
}