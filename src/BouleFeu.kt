fun bouleDeFeu(nomCast: String,nomCible: String,ScoreAtt: Int,ScoreDeftot: Int,NbPvCible: Int){
val nbdegat = LanceDess(ScoreAtt/3,6)
    val totD = nbdegat - ScoreDeftot
    var pvcible = NbPvCible

    if (totD < 0){
        totD == 0
    }
    println("$nomCast lance une boule de feu et inflige $totD de point de dégâts à $nomCible")




}
    fun LanceDess(lance: Int, face: Int): Int {
        var resultat = 0
        for (i in 1..lance) {
            resultat += (1..face).random()

        }
        return resultat
    }
fun main(){
    println(bouleDeFeu("Vegeta","Goku",88,90,100))
}