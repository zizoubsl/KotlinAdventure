fun attaque(nbpv: Int,scoredef: Int,nbdgat: Int,nomatt: String,nomCible: String){
var arm = nbdgat
    arm - scoredef
    if (arm < 0){
        arm = 0

    }
    var nvpv = nbpv - arm
        if (nvpv < 0){
            nvpv = 0
        }
    println("$nomatt attaque $nomCible pour $nbdgat\n")








}



fun calculDeefenseTotal(defe: Int ,Tar: Int,qualité: Int): Int {


    return defe + Tar + qualité



}
fun calculDegatAarme(nbdes: Int,NbFaces: Int,qual: Int,activeC: Int,coupC: Int): Int{
    var d = LanceDeees(nbdes,NbFaces)

    if (d >= activeC){
        d*=coupC

    }
    d+=qual

    if (d < 0){
        d = 0
    }



    return d



}

fun LanceDeees(lance: Int, face: Int): Int {
    var resultat = 0
    for (i in 1..lance) {
        resultat += (1..face).random()
    }
    return resultat
}

fun main(){
    println(attaque(15,4,3,"atomic","zizou",))
}