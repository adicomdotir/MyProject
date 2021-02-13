fun main() {
    //  kotlinc .\main.kt -include-runtime -d main.jar; java -jar main.jar
    println("Hello, World")
      
    val add: (Int, Int) -> Int = { i, j -> i + j }
    println(add(2, 3))
    
    val printAndDouble: (Int) -> Int = {
        println(it)
        it * 2
    }
    println(printAndDouble(6))
    
    val func: (Int) -> Int = fun(i: Int): Int {
        println(i)
        return i * 3
    }
    println(func(9))

    val gs = Student("Ali", "Daei", 18, 18.25F)
    println(gs.info())
}

open class Person(val firstName: String, val lastName: String, var age: Int) {
    open fun info(): String = "Person"
}

open class GlobalStudent(firstName: String,lastName: String, age: Int,val grade: Float): Person(firstName, lastName, age) {
    override fun info(): String = "GlobalStudent"
}

class Student(firstName: String,lastName: String, age: Int, grade: Float): GlobalStudent(firstName, lastName, age, grade) {
    override fun info(): String = "Student"
}