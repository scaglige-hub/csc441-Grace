package week4fri

fun main() {
    println("--- Step 1: two kinds of string ---")
    val firstName: String = "Grace"
    val middleName: String? = null

    println(firstName.length)
    println(middleName?.length)

    println("--- Step 2: safe call ---")
    println(middleName?.length)

    println("--- Step 3: Elvis ---")
    println(middleName?.length ?: 0) //if the value is null, return 0

    println("--- Step 4: let ---")
    middleName?.let {  //if it's not null do this:
        println("Middle name is: $it")
    }

    println("--- Step 5: the risky one ---") //aka don't do this
    val maybeNumber: Int? = 100
    println(maybeNumber!! + 1)

    println("--- Step 6: Where null actually come from ---")
    val notANumber = "banana".toIntOrNull()
    println(notANumber ?: "that was not a number")

    val captials = mapOf("France" to "Paris", "Japan" to "Tokyo") //key to value
    println(captials["Canada"] ?: "not in the map")

    val empty = listOf<Int>()
    println(empty.maxOrNull() ?: "empty list")

    println("--- Step 7: List and Mutable List ---")
    val shoppingList = listOf("bread", "butter", "water") //cannot change
    val toDoList = mutableListOf("homework", "laundry") //can change
    toDoList.add("dishes")
    toDoList.remove("laundry")
    println(shoppingList)
    println(toDoList)
    println("Items: ${toDoList.size}")

    println("--- Step 8: things lists can do ---")
    val scores = listOf(90, 72, 85, 64, 98)
    println(scores.sum())
    println(scores.average())
    println(scores.maxOrNull())
    println(scores.sorted())
    println(scores.filter { it >= 80}) //it refers to scores

}