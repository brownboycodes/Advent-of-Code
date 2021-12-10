package day_10


import java.io.File
import java.io.InputStream
import java.nio.file.Paths

fun day10() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_10/day10_sample_input.txt").inputStream()

    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_10/day10_test_input.txt").inputStream()
    var lineList = mutableListOf<String>()

    inputStream.bufferedReader().forEachLine { lineList.add(it) }

//println(lineList)
    totalCorruptedSyntax(lineList)
    totalIncompleteSyntax(lineList)
}