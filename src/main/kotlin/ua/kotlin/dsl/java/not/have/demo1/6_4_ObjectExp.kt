package ua.kotlin.dsl.java.not.have.demo1

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JPanel

/*interface A {
    fun a()
}*/

fun main(args: Array<String>) {
    JPanel().addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            print("mouseClicked")
        }

        override fun mouseEntered(e: MouseEvent) {
            print("mouseEntered")
        }
    })

}

