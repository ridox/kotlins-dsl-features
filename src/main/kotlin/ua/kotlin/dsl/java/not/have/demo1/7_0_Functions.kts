package ua.kotlin.dsl.java.not.have.demo1

import java.io.Closeable
import java.io.File

fun addNumbers1(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers2(a: Int, b: Int) = a + b

fun createPerson(name: String = "John Doe", age: Int = 0) = Person(name, age)
createPerson()

fun numericOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}
numericOperation(4, 2, ::addNumbers2)
numericOperation(4, 2, { a, b -> a * b })

fun numericOperationSingle(x: Int, op: (Int) -> Int): Int {
    return op(x)
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

val file = File("/tmp/1.txt")
val fileStream  = file.outputStream()

using(fileStream) {
    val string = "Hello".toByteArray()
    fileStream.write(string)
}
