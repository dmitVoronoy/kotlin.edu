package net.voronoy.kotlin.test.week4

val foo: Int
    get() = Math.random().times(1000).toInt()

fun main() {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}