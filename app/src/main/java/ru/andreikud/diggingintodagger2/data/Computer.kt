package ru.andreikud.diggingintodagger2.data

class Computer(
    private val ram: RAM
) {
    override fun toString(): String {
        return "Computer ($ram)"
    }
}