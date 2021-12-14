package day_14

// iterate loop 10 times
// take 2 chars from polymerTemplate at onetime and check in list
// if it exists in list place a Char between the 2chars and add to new string
// convert string after step 10 to set
// create object to store frequency of each unique character in the string
// print the difference between frequency of most common character and least common character

fun polymerization1(polymerTemplate: String, insertionRules: List<String>): Unit {
    var currentPolymerTemplate: String = polymerTemplate
    var newPolymerTemplate: String
    var currentPair: String
    var frequencies = mutableListOf<Long>()

    for (step in 1..10) {
        newPolymerTemplate = StringBuilder("").toString()
        for (i in 0 until currentPolymerTemplate.length - 1) {
            currentPair = currentPolymerTemplate[i].toString() + currentPolymerTemplate[i + 1].toString()
            for (insertionRule in insertionRules) {
                if (insertionRule.contains(currentPair)) {
                    if (newPolymerTemplate.isNotEmpty()) {
                        newPolymerTemplate = newPolymerTemplate.dropLast(1)
                    }
                    newPolymerTemplate += currentPolymerTemplate[i].toString() + insertionRule.last() + currentPolymerTemplate[i + 1].toString()
                    break
                }
            }
        }
        currentPolymerTemplate = newPolymerTemplate
    }

    for (j in currentPolymerTemplate.toSet()) {
        frequencies.add(currentPolymerTemplate.filter { it == j }.count().toLong())
    }
    println(frequencies.maxOrNull()?.minus(frequencies.minOrNull()!!))
}