package ua.kotlin.dsl.features.demo2

class Car {
    infix fun drive(speed: Int) {
        println("Driving with speed: $speed")
    }
}

val car = Car()

car drive 10

