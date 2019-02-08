package ua.kotlin.dsl.java.not.have.demo1

val s = "my string"
println("string text is $s")
println("lenght is ${if(s.length> 20) ">20" else "<20" }")