package net.voronoy.kotlin.test.week4

open class A1(open val value: String) {
    init {
        value.hashCode()
    }
}

class B(override val value: String) : A1(value)

fun main(args: Array<String>) {
    B("a")
}