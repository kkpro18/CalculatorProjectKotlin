package OLD

import kotlin.math.abs
import kotlin.math.pow

class PizzaCalculator {
    fun calculate() {

        print("Enter your first pizza size (inches) ")
        val pizza1Size = readln().toDouble()
        print("Enter the price of the pizza (£) ")
        val price1 = readln().toDouble()

        print("Enter your second pizza size (inches) ")
        val pizza2Size = readln().toDouble()
        print("Enter the price of the pizza (£) ")
        val price2 = readln().toDouble()
        val areaOfPizza1 = pizza1Size.pow(2) * Math.PI
        val price_per_inch_pizza1 = price1/areaOfPizza1
        val areaOfPizza2 = pizza2Size.pow(2) * Math.PI
        val price_per_inch_pizza2 = price2/areaOfPizza2
        val difference = abs(price_per_inch_pizza1 - price_per_inch_pizza2)
        if (price_per_inch_pizza1 > price_per_inch_pizza2){
            println("Pizza 2 ($pizza2Size inches) is better value for money, saving you £${String.format("%.2f",difference*areaOfPizza1)}.")
        } else {
            println("Pizza 1 ($pizza1Size inches) is better value for money, saving you £${String.format("%.2f",difference*areaOfPizza2)}.")
        }
    }
}
fun main() {
    val pizzaCalculator = PizzaCalculator()
    pizzaCalculator.calculate()
}