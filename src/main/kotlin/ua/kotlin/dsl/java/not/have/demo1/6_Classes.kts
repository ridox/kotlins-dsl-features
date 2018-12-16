package ua.kotlin.dsl.java.not.have.demo1

class Person(val name: String, val age: Int)

val person1 = Person("Bob", 31)

println(person1)
println(person1.name)
println(person1.age)

//person1.age = 21

/*data class Person2(val name: String = "N/A", val age: Int = -1)

val person2 = Person2()

println(person2)
println(person2.copy(age = 32))*/


/*
//The code snippet below for demo purposes only ;)
object PersonsRegister {
    val personsList = mutableListOf<Person>()
}

PersonsRegister.personsList.add(person1)
*/

