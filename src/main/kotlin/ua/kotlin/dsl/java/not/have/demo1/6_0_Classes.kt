package ua.kotlin.dsl.java.not.have.demo1

class Person(val name: String, val age: Int)

val person1 = Person("Bob", 31)

fun main(args: Array<String>) {
    println(person1)
    println(person1.name)
    println(person1.age)
    //person1.age = 21
}

//Show companion here (Ded sample)


