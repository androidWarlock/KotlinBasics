package basics

fun main(args: Array<String>) {
    val contcatedString = concatList(seperator = ":", stringsList = listOf("kotlin","java","swift"))

    print(contcatedString)
}

fun concatList(stringsList:List<String> ,seperator:String =", "):String{
    return stringsList.joinToString(seperator)
}