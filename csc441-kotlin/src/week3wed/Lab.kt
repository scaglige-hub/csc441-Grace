package week3wed

fun main() {
    val name = "Grace"
    val major = "Computer Science"
    val favFood = "Stuffed Artichokes"
    println("$name is studying $major, and enjoys eating $favFood")

    val courses = 7
    println("CS Courses taken: $courses")
    println("CS Courses taken after this one: ${courses + 1}")

    val language: String = "Kotlin"
    val age: Int = 20
    val gpa: Double = 3.4
    val learning: Boolean = true

    println("It is $learning that $name is learning.")
    println("Next year $name is turning ${age + 1} years old")
    println("$name has ${name.length} letters")

    print("Where are you from? ")
    val location = readlnOrNull()
    println("$location is a cool place to be from!")
}