package ua.kotlin.dsl.features.demo2

val isEven: (Int) -> Boolean = { it % 2 == 0 }
val r1 = isEven(1000)

val isOdd: Int.() -> Boolean = { this % 2 != 0 }
val r2 = 42.isOdd()


/*html {       // lambda with receiver begins here
    head()   // calling a method on the receiver object
    body()
}

class HTML {
    fun head() {}

    fun body() {}
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}*/

