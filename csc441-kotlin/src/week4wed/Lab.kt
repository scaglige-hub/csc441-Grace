package week4wed

fun main() {
    println("---Requirement 1: takes nothing, returns nothing---")
    describeToday()

    println("---Requirement 2: takes nothing, returns a string---")
    favoriteThing()

    println("---Requirement 3: takes one parameter---")
    pickOne(2)

    println("---Requirement 4: short---")

    println("---Requirement 5: takes two parameters---")
}

fun describeToday() {
    println("Middle of the week")
}

fun favoriteThing(): String {
    return "the night sky"
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "first choice"
        2 -> "second choice"
        else -> "different choice"
    }

}

fun pickOneShort(number: Int): String {

}

fun pickWithDefault(number: Int = 1, name: String = "you") {

}