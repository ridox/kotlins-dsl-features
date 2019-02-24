package ua.kotlin.dsl.java.not.have.demo1

var a: String = "this is A string"
//aMethod = null

var b: String? = "this is B string"
//b = null

val l1 = a.length

//val l2 = b.length
//val l2 = b!!.length
//val l2 = b?.length
//println(l2)
//println(l2 ?: throw Exception("Ouch!"))


/*
var someString: String? = "this is some string"

if (someString != null) {
    println("The string is not null. Length: ${someString!!.length}")
}

someString?.let { println("The string is not null. Length: ${it.length}") }

*/