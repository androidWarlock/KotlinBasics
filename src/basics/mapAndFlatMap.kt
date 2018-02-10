package basics

fun main(args: Array<String>) {
    //map()
    val list = (1..10).toList()
    val doubleList = list.map { it * 2 }

    println(list)
    println(doubleList)

    //flatMap

    val nestedList = listOf(
            (1..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )

    val notFlattened = nestedList.map { it.sortedDescending() }
    val flattened = nestedList.flatMap { it.sortedDescending() }

    println(notFlattened)
    println(flattened)
}