import kotlin.text.toDouble

class Boisson(var gout: String, var prix: Double, var kcal:Double ) {
    fun calculParQuantite(quantite: Int) : String = "pour $quantite le nombre de calorie est de ${kcal * quantite.toDouble()}"

}

