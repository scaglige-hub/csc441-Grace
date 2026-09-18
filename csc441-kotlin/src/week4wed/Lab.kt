package week4wed

fun main() {
    println("--- Requirement 1: takes nothing, returns nothing ---")
    describeToday()

    println("--- Requirement 2: takes nothing, returns a string ---")
    println(favoriteThing())

    println("--- Requirement 3: takes one parameter ---")
    println(pickOne(2))

    println("--- Requirement 4: short ---")
    println(pickOneShort(2))

    println("--- Requirement 5: takes two parameters ---")
    println(pickWithDefault())
    println(pickWithDefault(name = "Grace"))
}

fun describeToday() {
    println("Today is the middle of the week")
}

fun favoriteThing(): String {
    return "My favorite thing is music"
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "Spring"
        2 -> "Summer"
        3 -> "Autumn"
        4 -> "Winter"
        else -> "Not a season"
    }

}

fun pickOneShort(number: Int): String = when (number){
    1 -> "Spring"
    2 -> "Summer"
    3 -> "Autumn"
    4 -> "Winter"
    else -> "Not a season"
}

fun pickWithDefault(number: Int = 1, name: String = "you"): String {
    val season = when (number) {
        1 -> "Spring"
        2 -> "Summer"
        3 -> "Autumn"
        4 -> "Winter"
        else -> "Not a season"
    }
    return "$name: $season"
}