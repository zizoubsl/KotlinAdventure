fun calculDegatArme(nbdes: Int,NbFaces: Int,qual: Int,activeC: Int,coupC: Int): Int{
    var d = LanceDees(nbdes,NbFaces)

    if (d >= activeC){
        d*=coupC

    }
    d+=qual

    if (d < 0){
        d = 0
    }



    return d



}

fun LanceDees(lance: Int, face: Int): Int {
    var resultat = 0
    for (i in 1..lance) {
        resultat += (1..face).random()
    }
    return resultat
}

fun main(){
    println(calculDegatArme(2,4,2,10,2))

}



