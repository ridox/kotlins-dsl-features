package ua.kotlin.dsl.features.train

import ua.kotlin.dsl.features.train.steps.GoTo
import ua.kotlin.dsl.features.train.steps.IfStop
import ua.kotlin.dsl.features.train.steps.Right
import ua.kotlin.dsl.features.train.steps.Step

class Train(var position: Int, val processor: TrainProcessor = TrainProcessor()) {

    fun performStep(step: Step) {
        when (step) {
            is Right -> {
                moveRight()
                processor.nextStepToExecute++
            }
            is GoTo -> {
                processor.nextStepToExecute = step.stepNumberToGo
            }
            is IfStop -> {
                if (position == 0) {
                    performStep(step.stepIfStop)
                } else {
                    performStep(step.otherwiseStep)
                }
            }

        }
    }

    private fun moveRight() {
        position++
    }
}