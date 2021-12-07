package day_7

import kotlin.math.abs

fun findComplicatedPosition(positions: IntArray) {

    var fuelCostPerPosition = mutableMapOf<Int, Int>()

    var currentRunningCost: Int
    var s: Int
    var diff: Int
    var currentFuel: Int
    for (p1 in 0..positions.maxOrNull()!!) {
        if (!fuelCostPerPosition.containsKey(p1)) {
            currentRunningCost = 0
            for (p2 in positions) {
                currentFuel = 0
                s = 1
                diff = abs(p1 - p2)
                for (i in 1..diff) {
                    currentFuel += s
                    s++
                }
                currentRunningCost += currentFuel
            }

            fuelCostPerPosition[p1] = currentRunningCost
        }

    }
    var leastFuel: Int? = fuelCostPerPosition.values.minOrNull()
    if (leastFuel != null) {
        println(fuelCostPerPosition.filterValues { it == leastFuel }.keys)
        println(leastFuel)
    }
//    println(fuelCostPerPosition)
}