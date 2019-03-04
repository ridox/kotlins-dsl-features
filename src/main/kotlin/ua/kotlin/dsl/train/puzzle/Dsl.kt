package ua.kotlin.dsl.train.puzzle

import ua.kotlin.dsl.train.puzzle.steps.GoTo
import ua.kotlin.dsl.train.puzzle.steps.IfStop
import ua.kotlin.dsl.train.puzzle.steps.Right
import ua.kotlin.dsl.train.puzzle.steps.Step


fun dsl(init: DslContext.() -> DslContext) {
    val context = DslContext(mutableMapOf()).init()
    Program(context, -10, 1).runProgram()
}

class DslContext(val steps: MutableMap<Int, Step>) {
    fun step(stepNumber: Int, createStep: StepContext.() -> Step): DslContext {
        val step = StepContext().createStep()
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



/*object dsl {

    operator fun invoke(init: DslContext.() -> DslContext) {
        val context = DslContext(mutableMapOf()).init()
        Program(context, -1, 1).runProgram()
    }
}*/


