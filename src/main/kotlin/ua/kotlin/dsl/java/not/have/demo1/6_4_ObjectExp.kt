package ua.kotlin.dsl.java.not.have.demo1

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.io.Serializable
import javax.swing.JPanel


fun addMouseListeners(args: Array<String>) {

    JPanel().addMouseListener(object : MouseAdapter(), A {
        override fun mouseClicked(e: MouseEvent) {
            print("mouseClicked")
        }

        override fun mouseEntered(e: MouseEvent) {
            print("mouseEntered")
        }

        override fun aMethod() {
           val foo = foo()
           println(foo.x)
           println(foo.y)
        }

    })

}

private fun foo() = object {
    val x: String = "x"
    val y: String = "y"
}

interface A {
    fun aMethod()
}

