package ua.kotlin.dsl.features.train

import ua.kotlin.dsl.features.train.steps.GoTo
import ua.kotlin.dsl.features.train.steps.IfStop
import ua.kotlin.dsl.features.train.steps.Right
import ua.kotlin.dsl.features.train.steps.Step

object dsl {

    operator fun invoke(init: DslContext.() -> DslContext) {
        val context = DslContext().init()
        Program().runProgram(context)
    }
}

class DslContext {
    val steps = mutableMapOf<Int, Step>()

    fun step(stepNumber: Int, init: StepContext.() -> Step): DslContext {
        val step = StepContext().init()
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

