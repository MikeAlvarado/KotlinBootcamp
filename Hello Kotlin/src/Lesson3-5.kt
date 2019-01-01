fun main(args: Array<String>) {
    var hourArray = IntArray(24) { it }
    // hourArray.forEach { println(it) }


    val message = println("${if (hourArray[14] < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
}