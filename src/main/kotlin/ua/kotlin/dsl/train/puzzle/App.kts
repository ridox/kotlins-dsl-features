package ua.kotlin.dsl.train.puzzle

dsl {
    step(0) { right() }
    step(1) { ifStop { goto(3) otherwise goto(2) } }
    step(2) { goto(0) }
    step(3) { right() }
    step(4) { goto(3) }
}

