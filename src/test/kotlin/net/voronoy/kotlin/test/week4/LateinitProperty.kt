package net.voronoy.kotlin.test.week4

class A {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}

fun main() {
    val a = A()
    a.setUp()
    print(a.display())
}