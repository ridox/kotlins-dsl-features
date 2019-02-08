package ua.kotlin.dsl.train.puzzle

import ua.kotlin.dsl.train.puzzle.steps.GoTo
import ua.kotlin.dsl.train.puzzle.steps.IfStop
import ua.kotlin.dsl.train.puzzle.steps.Right
import ua.kotlin.dsl.train.puzzle.steps.Step

object dsl {

    operator fun invoke(init: DslContext.() -> DslContext) {
        val context = DslContext().init()
        Program(context).runProgram()
    }
}

class DslContext {
    val steps = mutableMapOf<Int, Step>()

    fun step(stepNumber: Int, init: StepContext.() -> Step): DslContext {
        val step = StepContext().let(init)
        steps[stepNumber] = step
        return this
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

