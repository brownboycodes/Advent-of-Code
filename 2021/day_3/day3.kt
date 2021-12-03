import day_3.lifeSupportRating
import day_3.mostCommonBit
import java.io.File
import java.io.InputStream
import java.nio.file.Paths


fun day3() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_3/day3_sample_input.txt").inputStream()

    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_3/day3_test_input.txt").inputStream()
    val lineList = mutableListOf<String>()

    inputStream.bufferedReader().forEachLine { lineList.add(it) }

    lifeSupportRating(lineList.toList())
}