package day_14

import java.io.File
import java.io.InputStream
import java.nio.file.Paths

fun day14() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_14/day14_sample_input.txt").inputStream()

    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_14/day14_test_input.txt").inputStream()
    var lineList = mutableListOf<String>()

//    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    val data = inputStream.bufferedReader().readLines()
    val polymerTemplate = data[0]
    for (i in 2 until data.size) {
        lineList.add(data[i])
    }
//    println(polymerTemplate)
//    println(lineList)
    polymerization1(polymerTemplate,lineList)
}

/*
After step 10, it has length 3073.
After step 10, B occurs 1749 times, C occurs 298 times, H occurs 161 times,
and N occurs 865 times;
taking the quantity of the most common element (B, 1749)
and subtracting the quantity of the least common element (H, 161)
produces 1749 - 161 = 1588
 */