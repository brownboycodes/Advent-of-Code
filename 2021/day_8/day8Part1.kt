package day_8

fun findInstancesInOutput(outputList: List<List<String>>) {

    var uniqueInstances = 0
    for (output in outputList) {
        for (signals in output) {
            when (signals.length) {
                2 -> uniqueInstances++
                4 -> uniqueInstances++
                3 -> uniqueInstances++
                7 -> uniqueInstances++
            }
        }
    }
    println(uniqueInstances)
}