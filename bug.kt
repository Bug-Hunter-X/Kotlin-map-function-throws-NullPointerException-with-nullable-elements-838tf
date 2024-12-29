fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = listOf(1, 2, null, 4, 5)
    val result2 = list2.map { it * 2 }
    println(result2) // This will throw NullPointerException
}