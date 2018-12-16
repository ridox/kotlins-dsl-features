package ua.kotlin.dsl.java.not.have.demo1

val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
val readOnlyView: List<Int> = numbers
println(numbers)
numbers.add(4)
println(readOnlyView)
//readOnlyView.clear()

val immutableList = listOf(1, 2, 3)
//immutableList.add(4)

/*for (i in 1..20) {
    if (i in 10..15) {
        println(i)
    }
}*/
