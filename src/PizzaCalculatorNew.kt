import kotlin.math.pow

class Pizza {

    var pizzaSize: Double? = null
    var pizzaPrice: Double? = null

    init {
        pizzaSize = askInput("Enter your pizza size (inches) ")
        pizzaPrice = askInput("Enter the price of the pizza (£) ")
    }

    private fun askInput(question: String): Double? {
        var answer: Double? = null
        while (true) {
            println(question)
            try {
                answer = readln().toDouble()
            } catch (exception: Exception) {
                println("Incorrect Input: Try Again")
            } finally {
                if (answer != null && answer!! != 0.0){
                    break
                }
            }
        }
        return answer
    }

    fun calculatePizzaPerCurrency(): Double? {
        val pizzaArea = (pizzaSize?.div(2))?.pow(2)?.times(Math.PI)
        val pizzaWorth = pizzaArea?.div(pizzaPrice!!) // !! forces it to believe it is not null
//        println("worth $pizzaWorth")
//        println("area $pizzaArea")
        return pizzaWorth
    }
}

fun whichIsBetterDeal(pizza1Size: Double?, pizza2Size: Double?, pizza1Price: Double?, pizza2Price: Double?, pizza1Worth: Double, pizza2Worth: Double){
        if (pizza1Worth == pizza2Worth) {
            println("Both Pizza Choices are Equal in Value")
        } else if (pizza1Worth > pizza2Worth){
            val extraPizzaPercentage = (pizza1Worth - pizza2Worth) / pizza2Worth * 100
            println("Pizza 1 ($pizza1Size inches for £$pizza1Price) is better value for money, giving you ${String.format("%.2f",extraPizzaPercentage)}% more pizza.")
        } else if (pizza2Worth > pizza1Worth){
            val extraPizzaPercentage = (pizza2Worth - pizza1Worth) / pizza1Worth * 100
            println("Pizza 2 ($pizza2Size inches for £$pizza1Price) is better value for money, giving you ${String.format("%.2f",extraPizzaPercentage)}% more pizza.")
        } else {
            println("Pizza Error Occured :<")
        }
    }

fun main() {
    val pizza1 = Pizza()
    val pizza2 = Pizza()
    val pizza1Worth = pizza1.calculatePizzaPerCurrency()
    val pizza2Worth = pizza2.calculatePizzaPerCurrency()
    whichIsBetterDeal(pizza1.pizzaSize, pizza2.pizzaSize, pizza1.pizzaPrice, pizza2.pizzaPrice, pizza1Worth!!, pizza2Worth!!)

//    println(pizza1.pizzaSize)
//    println(pizza1.pizzaPrice)
//    println(pizza2.pizzaSize)
//    println(pizza2.pizzaPrice)
}