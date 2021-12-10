package day_9

fun findLowestPoints(heightMap: List<List<Int>>):List<List<Int>> {
//    println(heightMap)
    var lowPoints = mutableListOf<Int>()
    var lowPointLocations = mutableListOf(listOf<Int>())
    for (row in heightMap.indices) {
        for (column in heightMap[row].indices) {
            // for first row
            if (row == 0) {
                if (column == 0) {
                    if (heightMap[row][column] < heightMap[row][column + 1] && heightMap[row][column] < heightMap[row + 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
                if (column == heightMap[row].size - 1) {
                    if (heightMap[row][column] < heightMap[row][column - 1] && heightMap[row][column] < heightMap[row + 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
                if (column > 0 && column < heightMap[row].size - 1) {
                    if (heightMap[row][column] < heightMap[row][column - 1] && heightMap[row][column] < heightMap[row][column + 1] && heightMap[row][column] < heightMap[row + 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
            }

            //for last row
            if (row == heightMap.size - 1) {
                if (column == 0) {
                    if (heightMap[row][column] < heightMap[row][column + 1] && heightMap[row][column] < heightMap[row - 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
                if (column == heightMap[row].size - 1) {
                    if (heightMap[row][column] < heightMap[row][column - 1] && heightMap[row][column] < heightMap[row - 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
                if (column > 0 && column < heightMap[row].size - 1) {
                    if (heightMap[row][column] < heightMap[row][column - 1] && heightMap[row][column] < heightMap[row][column + 1] && heightMap[row][column] < heightMap[row - 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
            }

            //for rows between the first and last rows
            if (row>0 && row <heightMap.size - 1) {
                if (column == 0) {
                    if (heightMap[row][column] < heightMap[row][column + 1] && heightMap[row][column] < heightMap[row - 1][column] && heightMap[row][column]<heightMap[row+1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
                if (column == heightMap[row].size - 1) {
                    if (heightMap[row][column] < heightMap[row][column - 1] && heightMap[row][column] < heightMap[row - 1][column] && heightMap[row][column]<heightMap[row+1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
                if (column > 0 && column < heightMap[row].size - 1) {
                    if (heightMap[row][column] < heightMap[row][column - 1] && heightMap[row][column] < heightMap[row][column + 1] && heightMap[row][column] < heightMap[row - 1][column] && heightMap[row][column] < heightMap[row + 1][column]) {
                        lowPoints.add(heightMap[row][column])
                        lowPointLocations.add(listOf(row,column))
                    }
                }
            }

        }
    }
//    println(lowPoints)
    println(lowPoints.sum()+lowPoints.size)
    println(lowPointLocations)
    return  lowPointLocations.slice(1 until  lowPointLocations.size)
}
