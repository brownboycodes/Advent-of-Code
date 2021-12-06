package day_6

fun finalCountAfterDays(fishLifeCycleList: IntArray, days: Int): Unit {
    var newLifeCycleFishList = fishLifeCycleList.toMutableList()
    var newFishes: Int
    var newBornFishes:IntArray
//    println(newLifeCycleFishList)
    for (i in 1..days) {
        newFishes = 0
        for (j in newLifeCycleFishList.indices) {
            if (newLifeCycleFishList[j] == 0) {
                newFishes++
                newLifeCycleFishList[j] = 6
            } else {
                newLifeCycleFishList[j] -= 1
            }
        }
        if (newFishes>0){
            newBornFishes= IntArray(newFishes){8}
            newLifeCycleFishList.addAll(newBornFishes.toList())
//            for(k in 1..newFishes){
//                newLifeCycleFishList.add(8)
//            }
        }
    }
    println(newLifeCycleFishList.size)
}