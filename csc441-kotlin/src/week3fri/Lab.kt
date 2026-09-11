package week3fri

fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    val packingList = mutableListOf("Passport", "Charger", "Headphones", "Toothbrush")

    for (item in packingList) {
        println(item)
    }

    packingList.forEachIndexed { index, item ->
        println("$index is $item")
    }

    for (i in 0 until packingList.size) {
        println("$i is ${packingList[i]}")
    }

    val value = 3

    when (value) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Unknown")
    }

    val budget = 60
    val amount = if (budget > 50) "Over budget" else "Under budget"
    println(amount)
}