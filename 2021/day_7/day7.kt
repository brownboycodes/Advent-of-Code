package day_7


import java.io.File
import java.io.InputStream
import java.nio.file.Paths


fun day7() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//   val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_7/day7_sample_input.txt").inputStream()

    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_7/day7_test_input.txt").inputStream()
    val lineList = mutableListOf<String> ()

    inputStream.bufferedReader().forEachLine { lineList.add(it)}
    var actualInput = lineList[0].split(",").map{it.toInt()}

//println(lineList)
//    println(actualInput)

//    findPosition(actualInput.toIntArray()) // 386536
    findComplicatedPosition(actualInput.toIntArray())
// !   finalCountAfterDays(actualInput.toIntArray(),256) // F#C$!!??
}