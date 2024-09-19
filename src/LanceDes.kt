

fun LanceDes(lance: Int, face: Int): Int {
    var resultat = 0
    for (i in 1 ..lance){
        resultat += (1..face ).random()


    }



    return resultat

}

fun main(){
    println(LanceDes(1,6))

}