package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPos = 0;
    var wrongPos = 0;
    var workString = secret
    var guessString = guess
    for (x in guess.indices) {

        if (workString[x] == guessString[x]) {
            rightPos++
            workString = workString.replaceRange(x until x+1, "~")
            guessString = guessString.replaceRange(x until x+1, ")")
        }
    }

    for (x in guess.indices) {
        if (workString.contains(guessString[x])) {
            wrongPos++
            workString = workString.replaceFirst(guessString[x], '(')
            guessString = guessString.replaceFirst(guessString[x], '$')
        }
    }

    return Evaluation(rightPos, wrongPos)
}


