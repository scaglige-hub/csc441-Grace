package week4wed

fun main() {
    println("---Requirement 1: takes nothing, returns nothing---")
    describeToday()

    println("---Requirement 2: takes nothing, returns a string---")
    favoriteThing()

    println("---Requirement 3: takes one parameter---")

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

}

fun pickOneShort(number: Int): String {

}

fun pickWithDefault(number: Int = 1, name: String = "you") {

}