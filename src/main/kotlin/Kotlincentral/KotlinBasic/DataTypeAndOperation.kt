package travelaround.Kotlincentral.KotlinBasic

fun main() {
    // Data type are -> specifies the kind of value a variable can hold

    // there are two kinds of a Tata Type

    // Primitive Data Type (Integer (Int), Double, Byte, Long, Character (Char), Floating Point (Float), Short, String)

    // Numbers (Integer (Int), Double, Byte, Long, Floating Point (Float), Short)

    var num: Int = 10
    // Int: Represents a 32-bit signed integer.
    // Use case: Storing whole numbers like age, count, or IDs.
    // Range: -2,147,483,648 to 2,147,483,647

    var gpa: Double = 3.02
    // Double: Represents a 64-bit floating-point number.
    // Use case: Storing precise decimal values, often used in scientific calculations, financial applications, or GPAs.
    // Precision: Up to 15–16 decimal places.

    var floatingPoint: Float = 5.0f
    // Float: Represents a 32-bit floating-point number.
    // Use case: Suitable for graphical calculations or cases where memory efficiency is preferred over precision.
    // Precision: Up to 6–7 decimal places.

    var short: Short = 5
    // Short: Represents a 16-bit signed integer.
    // Use case: Storing small integer values like temperature readings or small IDs to save memory.
    // Range: -32,768 to 32,767

    var byte: ByteArray = ByteArray(5)
    // ByteArray: Represents an array of bytes (8-bit values, each storing a number from -128 to 127).
    // Use case: Used in low-level data processing, file handling, network streams, or representing binary data.
    // Holds: Binary values (0s and 1s) as an array.

    var character: Char = 'a'
    // Char: Represents a single 16-bit Unicode character.
    // Use case: Used to store individual letters, digits, or symbols (e.g., 'A', '9', '$').
    // Holds: A single character from the Unicode set (e.g., English letters, special symbols, emojis, etc.).


    println("This is an integer :  $num")
    println("This is a double : $gpa")
    println("This is a float : $floatingPoint")
    println("This is a long : $short")
    println("This is a byte : $byte")
    println("This is a char : $character")


    // Non-Primitive Data Types (Arrays, String, Object, Collection (list, Set, Map), null tpe ?)

// 1. String (Immutable Object)
// - What it does: Stores sequences of characters.
// - Use case: Used for text processing, usernames, messages, or any textual data.
// - Stored value: A sequence of characters in Unicode format.
    var name: String = "Brandon"  // Stores the text "Brandon"

// 2. Object (Instance of a Class)
// - What it does: Represents a user-defined structure that contains properties and methods.
// - Use case: Used for modeling real-world entities (e.g., a car, a person, a product).
// - Stored value: An instance of a class that holds multiple properties.
    var myCar = Car() // Creating an instance of the Car class
    myCar.initializeCar()  // Initializing car details
    myCar.carInfo()  // Printing car information

// 3. Array (Collection of Similar Data Types)
// - What it does: Stores multiple values of the **same** data type in a contiguous memory location.
// - Use case: Useful for handling lists of numbers, names, or any group of related data.
// - Stored value: Multiple elements of the specified type in a structured way.
    var carBrands: Array<String> = arrayOf("Toyota", "Ford", "Chevy", "BMW")  // Array of car brands

// Printing the array values
    println("List of Car Brands:")
    for (brand in carBrands) {
        println(brand)  // Outputs each car brand stored in the array


    }

    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)  // List example
    var uniqueNumbers: Set<Int> = setOf(1, 2, 3, 3, 4)  // Set (no duplicates)
    var studentGrades: Map<String, Double> = mapOf("Alice" to 3.5, "Bob" to 3.8)  // Map (key-value pairs)

    var username: String? = null  // Can hold null
    println(username?.length)  // Null-safe access (prevents NullPointerException)



}

class Car{
    lateinit var brand: String
    lateinit var model: String
    var price: Double? = null // explicitly declare a variable null since kotlin require all variable to be initialize
    lateinit var year: String

    fun initializeCar() {
        brand = "Chevy"
        model = "Camaro"
        price = 24_687.0
        year = "2017"
    }

    fun carInfo() {
        val carInformation: String = String.format("%-10s %-8s $%-5.2f %-5s", brand, model, price, year)
        println(carInformation)
    }
}