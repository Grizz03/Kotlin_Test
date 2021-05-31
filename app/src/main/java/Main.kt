fun main(args: Array<String>) {
    println("Hello Kotlin")
    println("My first Kotlin program")
    // -> val is immutable
    // val steve: String = "Hello, my name is Steve!"
    val steve = 5
    println(steve)

    val steveSalary = 500
    val monthly = steveSalary * 5
    println(steveSalary)
    println(monthly)

    // User input through terminal
    println("How old are you?")
    val age = readLine()!!.toInt()

    // When statement (if/else)
    val message = when {
        age < 18 -> "Sorry you cant vote"
        age == 100 -> "Congrats"
        else -> "You can vote!"
    }
    println(message)
}
