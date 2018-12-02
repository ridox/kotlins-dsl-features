package ua.kotlin.dsl.features.train

object dsl {
    operator fun invoke(init: DslContext.() -> MutableMap<Int, Step>) {
        val commands = DslContext().init()
        commands.forEach{ (k, v) -> println("$k: ${v.name}") }
    }
}

//TODO: can switched class -> object
class DslContext {
    private val steps = mutableMapOf<Int, Step>()

    fun step(stepNumber: Int, init: StepContext.() -> Step): MutableMap<Int, Step> {
        val step = StepContext().init()
        steps[stepNumber] = step
        return steps
    }
}

open class StepContext {

    fun right(): Step {
        return Right()
    }

    fun goto(stepNumberToGo: Int): Step {
        return GoTo(stepNumberToGo)
    }

    fun ifStop(init: StepContextInternal.() -> Step): Step {
        return init(StepContextInternal())
    }
}

class StepContextInternal : StepContext() {

    infix fun Step.otherwise(otherwiseStep: Step): Step {
        return IfStop(this, otherwiseStep)
    }

}

abstract class Step(val name : String)

class Right : Step("Right")

class GoTo(val stepNumberToGo: Int) : Step("Goto")

class IfStop(val step: Step, val otherwiseStep: Step) : Step("IfStop")

dsl {
    // it is possible to get rid of () in right method by creating val right = right() or sort of
    step(0) { right() }
    step(1) { right() }
    //goto can be infix method
    step(2) { goto(3) }
    step(3) {
        ifStop {
            goto(3) otherwise right()
        }
    }
}






