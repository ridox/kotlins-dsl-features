package ua.kotlin.dsl.train.puzzle

class Program(private val dsl: DslContext, private val trainOnePosition:Int, private val trainTwoPosition: Int) {
    fun runProgram() {
        val steps = dsl.steps
        val train1 = Train(trainOnePosition)
        val train2 = Train(trainTwoPosition)
        while (train1.processor.nextStepToExecute < steps.size
            && train2.processor.nextStepToExecute < steps.size
            && train1.position != train2.position
        ) {
            println("Train1 position: ${train1.position}, performs step: ${steps[train1.processor.nextStepToExecute]!!.name}")
            train1.performStep(steps[train1.processor.nextStepToExecute]!!)
            println("Train2 position: ${train2.position}, performs step: ${steps[train2.processor.nextStepToExecute]!!.name}")
            train2.performStep(steps[train2.processor.nextStepToExecute]!!)
        }
        if (train1.position == train2.position) {
            println("Boom!!!")
        }
    }
}