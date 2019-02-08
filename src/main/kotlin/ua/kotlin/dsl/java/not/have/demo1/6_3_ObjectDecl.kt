package ua.kotlin.dsl.java.not.have.demo1

//Object declaration
object PersonsRegister {
    val personsList = mutableListOf<Person>()
}

fun main(args: Array<String>) {
    PersonsRegister.personsList.add(person1)
}

