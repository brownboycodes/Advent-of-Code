package day_6

import java.io.File
import java.io.InputStream
import java.nio.file.Paths


fun day6() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_6/day6_sample_input.txt").inputStream()

    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_6/day6_test_input.txt").inputStream()
    val lineList = mutableListOf<String> ()

    inputStream.bufferedReader().forEachLine { lineList.add(it)}
    var actualInput = lineList[0].split(",").map{it.toInt()}

//println(lineList)
//    println(actualInput)

    finalCountAfterDays(actualInput.toIntArray(),80) // 386536
// !   finalCountAfterDays(actualInput.toIntArray(),256) // F#C$!!??
}