fun furtherDive(movements:List<List<String>>):Int{
    var horizontalPosition=0
    var depth=0
    var aim=0

    for (i in 1 until movements.size){
        when(movements[i][0]){
            "forward"->{
                horizontalPosition+=movements[i][1].toInt()
                depth+=aim*movements[i][1].toInt()
            }
            "up"->aim-=movements[i][1].toInt()
            "down"->aim+=movements[i][1].toInt()
        }
    }
    return horizontalPosition*depth
}