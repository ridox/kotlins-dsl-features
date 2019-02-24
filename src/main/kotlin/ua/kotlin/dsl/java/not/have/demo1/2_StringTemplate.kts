package ua.kotlin.dsl.java.not.have.demo1

val s = "my string"
println("string text is $s")
println("string length is ${s.length}")

println("Random number is ${if(Math.random()> 0.5) ">0.5" else "<0.5"}")