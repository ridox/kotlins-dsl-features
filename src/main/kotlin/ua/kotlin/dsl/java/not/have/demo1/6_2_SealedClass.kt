package ua.kotlin.dsl.java.not.have.demo1

fun main(args: Array<String>) {
    val expression = Sum(Const(1.0), Const(1.0)) // 1.0 + 1.0
    println(eval(expression))
}

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    // the `else` clause is not required because we've covered all the cases
}
