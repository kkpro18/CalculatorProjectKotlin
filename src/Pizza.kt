import kotlin.math.pow

class Pizza {
    var pizzaSize = 0.0
    var pizzaPrice = 0.0

    init {
        while (true){
            var pizza = gatherPizzaDetails()
            if ((pizza[0] != null) && (pizza[1] != null)){
                break
            }
            println("Incorrect Entry")
        }
    }

    private fun gatherPizzaDetails(): Array<Double> {
        print("Enter your pizza size (inches) ")
        pizzaSize = readln().toDouble()
        print("Enter the price of the pizza (£) ")
        pizzaPrice = readln().toDouble()

        return arrayOf(pizzaSize, pizzaPrice)
    }

    fun calculatePizzaWorth(): Double {
        val pizzaPerMoney = (pizzaSize / 2).pow(2) / pizzaPrice
        println("$pizzaPerMoney")
        return pizzaPerMoney
    }

}

fun comparePizza(pizzaPerMoney1: Double, pizzaSize1: Double, pizzaPerMoney2: Double,pizzaSize2: Double, percentageDifference: Double) {
    if (pizzaPerMoney1 < pizzaPerMoney2){
        println("Pizza 2 ($pizzaSize2 inches) is better value for money, giving you ${String.format("%.2f",percentageDifference)}% extra.")
    } else if (pizzaPerMoney1 > pizzaPerMoney2) {
        println("Pizza 1 ($pizzaSize1 inches) is better value for money, giving you ${String.format("%.2f",percentageDifference)}% extra.")
    } else if (pizzaPerMoney1 == pizzaPerMoney2){
        println("Pizza is both equal in value")
    } else {
        println("Unexpected Error :(")
    }
}

fun percentageSaving(pizzaPerMoney1:Double, pizzaPerMoney2: Double): Double {
    var percentageDifference = 0.0
    if (pizzaPerMoney1 > pizzaPerMoney2){
        percentageDifference = ((pizzaPerMoney1 - pizzaPerMoney2) / pizzaPerMoney2)* 100
    } else if (pizzaPerMoney2 > pizzaPerMoney1){
        percentageDifference = ((pizzaPerMoney2 - pizzaPerMoney1) / pizzaPerMoney1)* 100
    } else {
        println("Pizza is both equal in value")
    }
    return percentageDifference
}

fun main() {
    val pizza1 = Pizza()
    val pizza1PerMoney = pizza1.calculatePizzaWorth()
    val pizza2 = Pizza()
    val pizza2PerMoney = pizza2.calculatePizzaWorth()
    val percentageDifference = percentageSaving(pizza1PerMoney, pizza2PerMoney)
    comparePizza(pizza1PerMoney, pizza1.pizzaSize, pizza2PerMoney, pizza2.pizzaSize, percentageDifference)

}