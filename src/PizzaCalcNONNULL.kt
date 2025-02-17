import kotlin.math.pow

class Pizza {

    var size : Double
    var price : Double
    var worth: Double = 0.0

    init {
        size = askInput("Enter your pizza size (inches): ").toDouble()
        price = askInput("Enter the price of the pizza (£): ").toDouble()
        worth = calculatePizzaPerCurrency()
    }

    private fun askInput(question: String): String {
        var answer: String
        while (true) {
            print(question)
            answer = readln()
            if (answer.toDoubleOrNull() is Double && answer.toDouble() > 0.0){
                break
            } else {
                println("Incorrect Input: Try Again")
            }
        }
        return answer
    }

    private fun calculatePizzaPerCurrency(): Double {
        val pizzaArea = (size / 2).pow(2).times(Math.PI)
        val pizzaWorth = pizzaArea.div(price)
        return pizzaWorth
    }
}

fun whichIsBetterDeal(pizza1: Pizza, pizza2: Pizza){
    if (pizza1.worth == pizza2.worth) {
        println("Both Pizza Choices are Equal in Value")
    } else if (pizza1.worth > pizza2.worth){
        val extraPizzaPercentage = (pizza1.worth - pizza2.worth) / pizza2.worth * 100
        println("Pizza 1 (${pizza1.size} inches for £${pizza1.price}) is better value for money, giving you ${String.format("%.2f",extraPizzaPercentage)}% more pizza.")
    } else if (pizza2.worth > pizza1.worth){
        val extraPizzaPercentage = (pizza2.worth - pizza1.worth) / pizza1.worth * 100
        println("Pizza 2 (${pizza2.size} inches for £${pizza2.price}) is better value for money, giving you ${String.format("%.2f",extraPizzaPercentage)}% more pizza.")
    } else {
        println("Pizza Error Occured :<")
    }
}

fun main() {
    val pizza1 = Pizza()
    val pizza2 = Pizza()
    whichIsBetterDeal(pizza1, pizza2)

//    println(pizza1.pizzaSize)
//    println(pizza1.pizzaPrice)
//    println(pizza2.pizzaSize)
//    println(pizza2.pizzaPrice)
}