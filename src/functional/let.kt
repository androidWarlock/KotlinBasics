package functional

import java.io.File

fun main(args: Array<String>) {


    //scoping
    File("example.txt").bufferedReader().let {
        if (it.ready())
            println(it.readLine())

        //reader exist only inside this lambda function
    }


    //nullables

    //False way
//    val str : String? = "Android For Kotlin"
//    if (str?.isEmpty()){  //this will make error and the bad soltution will be to use unsafe call str!!.isEmpty()
//        str?.toLowerCase()
//    }

    //The good solution is to use let which will only be executed if str isn't null
    //Right way
    val str : String? = "Android For Kotlin"
    str?.let {
        if (str.isNotEmpty())
            str.toLowerCase()
    }

}