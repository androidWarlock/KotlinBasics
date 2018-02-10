package functional

fun main(args: Array<String>) {

    val possiblePrimesAfter2 = generateSequence(3, {it +2 })
    val primes = generateSequence(2 to possiblePrimesAfter2){

        val nextPrimenumber = it.second.first()
        val nextSequence = it.second.filter { it% nextPrimenumber != 0 }

        nextPrimenumber to nextSequence

    }.map { it.first }

    println(primes.take(10).toList())
}