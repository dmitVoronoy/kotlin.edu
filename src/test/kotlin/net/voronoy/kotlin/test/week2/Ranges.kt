package net.voronoy.kotlin.test.week2

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) {
        return false
    }
    if (s[0] !in 'a'..'z' && s[0] != '_') {
        return false
    }
    for (ch in s) {
        if (ch !in 'a'..'z' && ch !in '0'..'9' && ch != '_') {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}