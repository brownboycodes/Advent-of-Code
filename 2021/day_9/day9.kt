package day_9


import java.io.File
import java.io.InputStream
import java.nio.file.Paths

fun day9() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_9/day9_sample_input.txt").inputStream()

//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_9/day9_test_input.txt").inputStream()
    var lineList = mutableListOf(listOf<Int>())

    inputStream.bufferedReader().forEachLine { lineList.add(it.split("").filter { !it.isNullOrEmpty() }.map { it.toInt() }) }

//println(lineList)
println(findLowestPoints(lineList.slice(1 until lineList.size)))

}