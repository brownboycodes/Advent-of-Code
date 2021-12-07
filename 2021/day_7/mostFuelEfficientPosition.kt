package day_7

import kotlin.math.abs

fun findPosition(positions: IntArray) {

    var fuelCostPerPosition = mutableMapOf<Int, Int>()

    var currentRunningCost: Int
    for (p1 in positions) {
        if (!fuelCostPerPosition.containsKey(p1)) {
            currentRunningCost = 0
            for (p2 in positions) {
                currentRunningCost += abs(p1 - p2)
            }

            fuelCostPerPosition[p1] = currentRunningCost
        }

    }
    var leastFuel: Int? = fuelCostPerPosition.values.minOrNull()
    if (leastFuel != null) {
        println(fuelCostPerPosition.filterValues { it == leastFuel }.keys)
        println(leastFuel)
    }
}