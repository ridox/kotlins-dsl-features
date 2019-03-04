package ua.kotlin.dsl.features.demo2

import ua.kotlin.dsl.features.demo2._2_0_ExtensionFunAndOperatorOverloading.TimeInterval.*
import java.time.LocalDateTime

enum class TimeInterval { DAY, WEEK, YEAR }

/**
 * [Link to Kotlin site](https://kotlinlang.org/docs/reference/operator-overloading.html#operator-overloading)
 */
operator fun LocalDateTime.plus(interval: TimeInterval): LocalDateTime {
    return when (interval) {
        DAY -> this.plusDays(1)
        WEEK -> this.plusWeeks(1)
        YEAR -> this.plusYears(1)
    }
}

println(LocalDateTime.now())
println(LocalDateTime.now() + DAY)
println(LocalDateTime.now() + WEEK)
println(LocalDateTime.now() + YEAR)