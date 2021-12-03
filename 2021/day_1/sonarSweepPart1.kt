fun sonarSweep1(depths: IntArray): Int {

    var depthIncrements = 0
    var currentDepth: Int = depths[0]
    for (i in 1 until depths.size) {
        if (depths[i] > currentDepth) {
            depthIncrements++
        }

        currentDepth = depths[i]
    }

    return depthIncrements
}