package day_8


import java.io.File
import java.io.InputStream
import java.nio.file.Paths

fun day8() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
   val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_8/day8_sample_input.txt").inputStream()

//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_8/day8_test_input.txt").inputStream()
    var lineList = mutableListOf(listOf<String>())

    inputStream.bufferedReader().forEachLine { lineList.add(it.split("|"))}
    var actualInput = mutableListOf(listOf<String>())

    for (i in 1 until lineList.size){
        actualInput.add(lineList[i].last().trim().split(" "))

    }



    findInstancesInOutput(actualInput.slice(1 until actualInput.size))
}