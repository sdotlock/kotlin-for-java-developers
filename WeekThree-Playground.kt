/**
 * WEEK TWO - KOTLIN FOR JAVA DEVELOPERS
 * Covering 'Nullability", 'SafeCasts', 'Functional Programming'
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
    safeCastPlayground()

    /* PLAYGROUND THREE CALLS */
    val list1 = listOf(1, 2, 3)
    list1.allNonZero() eq true
    list1.allNonZero1() eq true
    list1.allNonZero2() eq true

    list1.containsZero() eq false
    list1.containsZero1() eq false
    list1.containsZero2() eq false

    val list2 = listOf(0, 1, 2)
    list2.allNonZero() eq false
    list2.allNonZero1() eq false
    list2.allNonZero2() eq false

    list2.containsZero() eq true
    list2.containsZero1() eq true
    list2.containsZero2() eq true
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

/**
 * Type cast as throws ClassCastException, if the cast is unsuccessful. Safe cast as? returns null, if the cast is unsuccessful.
 * Declare the s variable to make the first line print null and the second one throw an exception.
 */
fun safeCastPlayground() {
    val s = "samuel"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}


/**
 *Functions 'all', 'none' and 'any' are interchangeable, you can use one or the other to implement the same functionality.
 * Implement the functions 'allNonZero' and 'containsZero' using all three predicates in turn. 'allNonZero' checks that all the elements in the list are non-zero; 'containsZero' checks that the list contains zero element.
 * Add the negation before the whole call (right before 'any', 'all' or 'none') when necessary, not only inside the predicate.
 */

fun List<Int>.allNonZero() =  all { it != 0 }
fun List<Int>.allNonZero1() =  none { it == 0 }
fun List<Int>.allNonZero2() =  !any { it == 0 }

fun List<Int>.containsZero() =  any { it < 1 }
fun List<Int>.containsZero1() =  !all {  it != 0 }
fun List<Int>.containsZero2() =  !none { it == 0 }

