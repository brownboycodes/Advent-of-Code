package day_3


fun mostCommonBit(binaries:List<String>){
    var N=binaries.size/2

    var binaryCounter= IntArray(binaries[0].length).toMutableList()
    for (binary in binaries){
        for (i in binary.indices){
            if (binary[i]=='1'){
            binaryCounter[i]+=1
            }
        }
    }

    var gammaRate=""
    var epsilonRate=""

    for (b in binaryCounter){
    if (b>N) {
        gammaRate+="1"
        epsilonRate+="0"
    }else {
        gammaRate+="0"
        epsilonRate+="1"
    }
    }

    println(gammaRate.toLong(2)*epsilonRate.toLong(2))

}