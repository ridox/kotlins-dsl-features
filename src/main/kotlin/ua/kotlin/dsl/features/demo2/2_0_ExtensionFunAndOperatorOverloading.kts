package ua.kotlin.dsl.features.demo2

import ua.kotlin.dsl.features.demo2._2_0_ExtensionFunAndOperatorOverloading.TimeInterval.*
import java.time.LocalDateTime

enum class TimeInterval { DAY, WEEK, YEAR }

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