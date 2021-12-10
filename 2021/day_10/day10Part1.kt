package day_10

fun totalCorruptedSyntax(syntaxList: List<String>) {
    var totalScore = 0
    var syntaxScores = mapOf(
            ')' to 3,
            '}' to 1197,
            ']' to 57,
            '>' to 25137
    )
    val openBraces = listOf('(', '{', '[', '<')
    var parenthesesStack: MutableList<Char>
    for (syntaxes in syntaxList) {
        parenthesesStack = mutableListOf()
        for (s in syntaxes) {
            if (s == ')' && parenthesesStack.last() == '(' ||
                    s == '}' && parenthesesStack.last() == '{' ||
                    s == ']' && parenthesesStack.last() == '[' ||
                    s == '>' && parenthesesStack.last() == '<') {
                parenthesesStack.removeLast()
            } else if (s in openBraces) {
                parenthesesStack.add(s)
            } else {
                totalScore += syntaxScores[s]!!
                break
            }

        }

    }
    println(totalScore)
}