import kotlin.math.pow

class Pizza {

    var size : Double
    var price : Double

    init {
        size = askInput("Enter your pizza size (inches) ").toDouble()
        price = askInput("Enter the price of the pizza (£) ").toDouble()
    }

    private fun askInput(question: String): String {
        var answer: String
        while (true) {
            println(question)
            answer = readln()
            if (answer.toDoubleOrNull() is Double && answer.toDouble() > 0.0){
                break
            } else {
                println("Incorrect Input: Try Again")
            }
        }
        return answer
    }

    fun calculatePizzaPerCurrency(): Double {
        val pizzaArea = (size / 2).pow(2).times(Math.PI)
        val pizzaWorth = pizzaArea.div(price)
//        println("worth $pizzaWorth")
//        println("area $pizzaArea")
        return pizzaWorth
    }

//    fun multiplePizzas(numberOfPizzas: Int){
//        if (numberOfPizzas > 1){
//
//        }
//
//    }
}

fun whichIsBetterDeal(pizza1Size: Double, pizza2Size: Double, pizza1Price: Double, pizza2Price: Double, pizza1Worth: Double, pizza2Worth: Double){
    if (pizza1Worth == pizza2Worth) {
        println("Both Pizza Choices are Equal in Value")
    } else if (pizza1Worth > pizza2Worth){
        val extraPizzaPercentage = (pizza1Worth - pizza2Worth) / pizza2Worth * 100
        println("Pizza 1 ($pizza1Size inches for £$pizza1Price) is better value for money, giving you ${String.format("%.2f",extraPizzaPercentage)}% more pizza.")
    } else if (pizza2Worth > pizza1Worth){
        val extraPizzaPercentage = (pizza2Worth - pizza1Worth) / pizza1Worth * 100
        println("Pizza 2 ($pizza2Size inches for £$pizza2Price) is better value for money, giving you ${String.format("%.2f",extraPizzaPercentage)}% more pizza.")
    } else {
        println("Pizza Error Occured :<")
    }
}

fun main() {
    val pizza1 = Pizza()
    val pizza2 = Pizza()
    val pizza1Worth = pizza1.calculatePizzaPerCurrency()
    val pizza2Worth = pizza2.calculatePizzaPerCurrency()
    whichIsBetterDeal(pizza1.size, pizza2.size, pizza1.price, pizza2.price, pizza1Worth, pizza2Worth)

//    println(pizza1.pizzaSize)
//    println(pizza1.pizzaPrice)
//    println(pizza2.pizzaSize)
//    println(pizza2.pizzaPrice)
}