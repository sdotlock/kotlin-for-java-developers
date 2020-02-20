/**
 * WEEK FOUR - KOTLIN FOR JAVA DEVELOPERS
 * Covering 'Properties", "OOP'
 * @see https://www.coursera.org/learn/kotlin-for-java-developers/home/week/4
 * @author Sam Lock
 */

class A {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}

fun main(args: Array<String>) {
    val a = A()
    a.setUp()
    a.display()
}