fun boirePotion(nomPerso: String,nbpvPerso: Int,nbpvMaxPerso: Int,popolvl: Int){
    var exPV = nbpvPerso
    var nvpvlvlpopo = popolvl+ nbpvPerso

    if(nvpvlvlpopo > nbpvMaxPerso){
       nbpvPerso == nbpvMaxPerso
    }
    var newPV = nvpvlvlpopo - exPV
    println("$nomPerso boit une potion  est récupere $newPV")
}

fun main(){
    println(boirePotion("goku",8,20,6))
}
