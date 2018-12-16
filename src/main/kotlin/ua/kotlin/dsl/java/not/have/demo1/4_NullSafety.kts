package ua.kotlin.dsl.java.not.have.demo1

var a: String = "this is A string"
//a = null

var b: String? = "this is B string"
//b = null

val l1 = a.length

//val l2 = b.length
//val l2 = b!!.length
//val l2 = b?.length

//b?.let { println("B string is not null. Length: ${it.length}") }

println(a)
println(a.length)
println(b)
println(b?.length)
