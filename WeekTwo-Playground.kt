/**
 * WEEK TWO - KOTLIN FOR JAVA DEVELOPERS
 * Covering 'Basics', 'Control Structures", "Extensions'
 * @see https://www.coursera.org/learn/kotlin-for-java-developers/home/week/2
 * @author Sam Lock
 */

fun main(args: Array<String>) {

    // PLAYGROUND ONE CALLS
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

    // PLAYGROUND TWO CALL
    val sum = sum(listOf(1, 2, 3))
    println(sum)    // 6

}

/**
 * Implement the function that checks whether a string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
 */

fun isValidIdentifier(s: String): Boolean {
    val re = Regex("[^A-Za-z0-9_]")

            return when {
                s.isEmpty() -> false
                s.contains(re) -> false
                s.get(0).isDigit() -> false
                s.get(0) == '_' -> true
                else -> true
            }

    return false
}

/**
 * Change the 'sum' function so that it was declared as an extension to List<Int>.
 */

fun sum(list: List<Int>): Int = list.sum()


