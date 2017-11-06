package i_introduction._3_Default_Arguments

import util.JavaCode

class JavaCode3 : JavaCode() {
    private val defaultNumber = 42

    fun foo(name: String, number: Int = defaultNumber, toUpperCase: Boolean = false): String {
        return (if (toUpperCase) name.toUpperCase() else name) + number
    }
}