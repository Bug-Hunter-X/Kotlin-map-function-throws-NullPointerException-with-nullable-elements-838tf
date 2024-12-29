fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = listOf(1, 2, null, 4, 5)

    // Solution 1: Using mapNotNull
    val result2 = list2.mapNotNull { it?.let { it * 2 } }
    println(result2) // Output: [2, 4, 8, 10]

    // Solution 2: Using safe call operator and elvis operator
    val result3 = list2.map { it?.times(2) ?: 0 }
    println(result3) // Output: [2, 4, 0, 8, 10]
} 