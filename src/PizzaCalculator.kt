import kotlin.math.abs

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

        val price_per_inch_pizza1 = price1/pizza1Size
        val price_per_inch_pizza2 = price2/pizza2Size
        val difference = abs(price_per_inch_pizza1 - price_per_inch_pizza2)
        if (price_per_inch_pizza1 > price_per_inch_pizza2){
            println("Pizza 2 ($pizza2Size inches) is better value for money, saving you £${String.format("%.2f",difference*pizza2Size)}.")
        } else {
            println("Pizza 1 ($pizza1Size inches) is better value for money, saving you £${String.format("%.2f",difference*pizza2Size)}.")
        }

    }
}
fun main(args: Array<String>) {
    val pizzaCalculator = PizzaCalculator()
    pizzaCalculator.calculate()
}