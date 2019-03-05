package ua.kotlin.dsl.java.not.have.demo1

import java.math.BigDecimal

fun String.hello(): String {
    return "Hello $this!"
}

println("Vova".hello())


"SomeSentence1" shouldBeEqual "SomeSentence2"

infix fun String.shouldBeEqual(s: String): Boolean {
    return this == s
}

23.bd

val Int.bd: BigDecimal
    get() {
        return this.toBigDecimal()
    }


WebDriver().login()

fun WebDriver.login() {
    println("Login to Website")
}

class WebDriver {}

