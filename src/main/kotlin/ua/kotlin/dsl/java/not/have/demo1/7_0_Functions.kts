package ua.kotlin.dsl.java.not.have.demo1

import java.io.Closeable
import java.io.File

fun addNumbers1(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers2(a: Int, b: Int) = a + b
println(addNumbers1(3, 2))
println(addNumbers2(3, 2))


data class Person(val name: String, val age: Int)
fun createPerson(name: String = "John Doe", age: Int = 0) = Person(name, age)
println(createPerson(age = 33, name = "Alice"))


fun numericOperation(x: Int, y: Int, func: (Int, Int) -> Int): Int {
    return func(x, y)
}
numericOperation(4, 2, ::addNumbers2)
numericOperation(4, 2, { a, b -> a * b })

fun numericOperationSingle(x: Int, func: (Int) -> Int): Int {
    return func(x)
}
numericOperationSingle(3) { it + 1 }

fun using(obj: Closeable, block: () -> Unit) {
    //show how it can be replaced with use
    try {
        block()
    } finally {
        obj.close()
    }
}

val file  = File("/tmp/1.txt").outputStream()
using(file) {
    val string = "Hello".toByteArray()
    file.write(string)
}
