package day_2

import dive
import furtherDive
import java.io.File
import java.io.InputStream
import java.nio.file.Paths


fun day2() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_2/day2_advent_of_code_sample_input.txt").inputStream()

    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_2/day2_advent_of_code_test_input.txt").inputStream()
    val lineList = mutableListOf (listOf<String>())

    inputStream.bufferedReader().forEachLine { lineList.add(it.split(" ").toList())}


//    println(dive(lineList.toList()))
    println(furtherDive(lineList.toList()))
}


