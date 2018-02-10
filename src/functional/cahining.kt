package functional

fun main(args: Array<String>) {
    val inputRows = listOf(
            mapOf("input1.csv" to listOf(3,5,-9977,11,66)),
            mapOf("input2.csv" to listOf(1,3,4)),
            mapOf("input3.csv" to listOf()),
            mapOf("input4.csv" to listOf(9989, 33, 14, 12, 5))
    )

    val cleanedArray = inputRows.flatMap { it.values }
            .flatten()
            .filter { it in 0..100 }
            .toIntArray()

    println(cleanedArray.joinToString())
}