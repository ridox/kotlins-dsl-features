package ua.kotlin.dsl.features.demo2

val isEven: Int.() -> Boolean = { this % 2 == 0 }
val isOdd: Int.() -> Boolean = { this % 2 != 0 }

val list = listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())

println(list)