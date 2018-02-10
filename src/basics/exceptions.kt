package basics

import java.io.IOException

fun main(args: Array<String>) {
    val userInput = try {
        readUserInput()
        "defaultValue"
    }catch (e:IOException){
        e.printStackTrace()
        "catchDefaultValue"
    }finally {
        println("finished trying to get the user input")
    }

    println(userInput)
}

fun readUserInput(){
    throw IOException("couldn't get the job done")
}