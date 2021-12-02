fun groupsOf3(depths: IntArray): Int{
    var simplifiedDepths= mutableListOf<Int>()
    for (i in 2 until depths.size){
        simplifiedDepths.add(depths.slice((i-2)..i).sum())

    }
    return sonarSweep1(simplifiedDepths.toIntArray())
}