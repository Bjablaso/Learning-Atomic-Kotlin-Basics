package travelaround.Basic


fun main(args: Array<String>) {
    // variable - are name storage location
    // ( they are used to map the data which is store somewhere in memory to our code)

    // there are two type of variable in kotlin
    // 1) mutable variable ( one that we can change it value at anypoint in our code)
    //2) immutable variable ( ont that we cannot change it value once initialize
     // var  - keyword for creating a variable is immutable
    // val - keyword that use for creating variable that is immutable

    val dateOfBirth : String = "17/June/2000" // immutable
    var age = 20 // mutable // immutable.

    println("I am $age years old") // Standard output println use to print the output of our code, and it moves
    // the cursor to the next line when done and $ dollar sign use when we want to embed variable name with in a set
    // of strings (this is called a template)

    println("the sume of 2 + 2 is ${2 + 2}") // we can do calculation or code int the Standard out Put by using $ dollar
    //sign, and a block { }

    // variable have two part (declaration and initialization)

    //Declaration - is the process of finding a variable without assigning a value.
    val dob : String
    var age_ : Int
    //Initialization is the process of assigning value two or variable.
    dob = "18 March 2023"
    age = 15


    // once Mutable variable is initialized, you cannot change the value
    //dob = "19 June 2000" // throw an error

    //How everr we can change the state of val value if we were to use an object
    val listOfDOB : ArrayList<String> =  arrayListOf(dateOfBirth, dob) // here we have a list of DOB

    // we create a new list
    val newListOfDOB : ArrayList<String> = arrayListOf(dob, dateOfBirth) // new list of dob

   // listOfDOB = newListOfDOB // this throw an error because you cannot assign a new value to an immjutable object

    // however, you can manipulate the state of set object
    listOfDOB.add("12 March 2023") // we can add a new DOB to our array

    println("Here is the lisst of Bairth Date " + listOfDOB) // we can also use string concatenation


}