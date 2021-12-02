import java.io.File
import java.io.InputStream
import java.nio.file.Paths


fun main() {
    val currentWorkingDirectory = Paths.get("").toAbsolutePath().toString()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_1/day1_advent_of_code_test_input.txt ").inputStream()
//    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_1/day1_part2_sample_input.txt ").inputStream()
    val inputStream: InputStream = File("$currentWorkingDirectory/2021/day_1/day1_part2_input.txt ").inputStream()
    val lineList = mutableListOf<Int>()

    inputStream.bufferedReader().forEachLine { lineList.add(it.toInt()) }

//    println(sonarSweep1(lineList.toIntArray()))
    println(groupsOf3(lineList.toIntArray()))

}

private operator fun Int.invoke(toIntArray: IntArray): Any? {
    TODO("Not yet implemented")
}
