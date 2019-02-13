package ua.kotlin.dsl.java.not.have.demo1

data class DataPerson(val name: String = "John Doe", val age: Int = -1)

val person1 = DataPerson()
val copyOfPerson = person1.copy(age = 32)
val bob = DataPerson("Bob")
val john = DataPerson(age = 31)
val (name, age) = DataPerson(age = 31, name = "Abnormal Bob")

println(person1)
println(copyOfPerson)
println(bob)
println(john)
println("Name: $name; Age: $age")
