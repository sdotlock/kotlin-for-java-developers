/**
 * WEEK TWO - KOTLIN FOR JAVA DEVELOPERS
 * Covering 'Nullability", "Functional Programming'
 * @see https://www.coursera.org/learn/kotlin-for-java-developers/home/week/3
 * @author Sam Lock
 */

fun main(args: Array<String>) {

    /* PLAYGROUND ONE CALLS*/
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true
    val s3 = "   "
    s3.isEmptyOrNull() eq false

    /* PLAYGROUND TWO CALLS */


    /* PLAYGROUND THREE CALLS */

}
// PLAYGROUND ONE HELPER
infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

/**
 * Add and implement an extension function 'isEmptyOrNull()' on the type String?. It should return true, if the string is null or empty.
 */
fun String?.isEmptyOrNull(): Boolean {
    if (this == null || this == "") return true
        return false
}
