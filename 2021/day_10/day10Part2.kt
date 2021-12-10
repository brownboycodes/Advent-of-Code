package day_10

fun totalIncompleteSyntax(syntaxList: List<String>) {
    var currentScore: Long
    var wrongBrace: Boolean
    var totalScores = mutableListOf<Long>()
    var syntaxScores = mapOf(
            '(' to 1,
            '[' to 2,
            '{' to 3,
            '<' to 4,
    )

    var parenthesesStack: MutableList<Char>
    for (syntaxes in syntaxList) {
        wrongBrace = false
        parenthesesStack = mutableListOf()
        for (s in syntaxes) {
            if (s == ')' && parenthesesStack.last() == '(' ||
                    s == '}' && parenthesesStack.last() == '{' ||
                    s == ']' && parenthesesStack.last() == '[' ||
                    s == '>' && parenthesesStack.last() == '<') {
                parenthesesStack.removeLast()
            } else if (s in syntaxScores.keys) {
                parenthesesStack.add(s)
            } else {
                wrongBrace = true
                break
            }
        }
        if (parenthesesStack.isNotEmpty() && !wrongBrace) {

            currentScore = 0
            for (i in parenthesesStack.size - 1 downTo 0) {
                currentScore = currentScore * 5 + syntaxScores[parenthesesStack[i]]!!
            }

            totalScores.add(currentScore)
        }
    }

    totalScores.sort()

    println(totalScores[totalScores.size / 2])

}