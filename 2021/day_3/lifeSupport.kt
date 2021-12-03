package day_3

/*
*   life support rating = oxygen generator rating *  CO2 scrubber rating
*   filtering out values until only one remains
*
* */

fun lifeSupportRating(binaries: List<String>) {


    var oxygenGeneratorRating = binaries
    var temp1 = mutableListOf<String>()
    var len = oxygenGeneratorRating[0].length


    for (i in 0 until len) {
        var binCount: Any = getBits(oxygenGeneratorRating, i)

        for (oxy in oxygenGeneratorRating) {
            if (binCount == "equal" && oxy[i] == '1') {
                temp1.add(oxy)
            }
            if (binCount == 1 && oxy[i] == '1') {
                temp1.add(oxy)
            }
            if (binCount == 0 && oxy[i] == '0') {
                temp1.add(oxy)
            }

        }
        oxygenGeneratorRating = temp1

        if (oxygenGeneratorRating.size == 1) break
        temp1 = mutableListOf()
    }


    var co2ScrubberRating = binaries
    var temp2 = mutableListOf<String>()


    for (i in 0 until len) {
        var binCount: Any = getBits(co2ScrubberRating, i)

        for (co in co2ScrubberRating) {
            if (binCount == "equal" && co[i] == '0') {
                temp2.add(co)
            }
            if (binCount == 1 && co[i] == '0') {
                temp2.add(co)
            }
            if (binCount == 0 && co[i] == '1') {
                temp2.add(co)
            }

        }
        co2ScrubberRating = temp2

        if (co2ScrubberRating.size == 1) break
        temp2 = mutableListOf()
    }
println(oxygenGeneratorRating[0].toLong(2)*co2ScrubberRating[0].toLong(2))
}

fun getBits(binaries: List<String>, pos: Int): Any {

    var ones = 0
    var zeroes = 0

    for (binary in binaries) {
        if (binary[pos] == '1') {
            ones += 1
        } else {
            zeroes += 1
        }

    }

    if (ones == zeroes) return "equal"
    return if (ones > zeroes) 1 else 0
}