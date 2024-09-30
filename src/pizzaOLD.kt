//import kotlin.math.pow
//
//class pizzaOLD {
//    var pizzaSize: Double? = null
//    var pizzaPrice: Double? = null
//
//    init {
//        // runs when an instance is created
//        // maybe implement the input asking
//        pizzaSize = gatherPizzaDetails().get(0)
//        pizzaPrice = gatherPizzaDetails().get(1)
//    }
//
//    private fun gatherPizzaDetails(): Array<Double?> {
//        askInput()
//        while (true){
//            if (pizzaPrice is Number && pizzaSize is Number) {
//                break
//            }
//            else if (pizzaPrice !is Number && pizzaSize !is Number) {
//                println("Incorrect Entry; enter numbers only")
//                askInput()
//            }
//
//        }
//        return arrayOf(pizzaSize, pizzaPrice)
//    }
//
//    private fun askInput(){
//        print("Enter your pizza size (inches) ")
//        pizzaSize = readln().toDouble()
//        print("Enter the price of the pizza (£) ")
//        pizzaPrice = readln().toDouble()
//    }
//
//    fun getWorth(int size, int price) {
//        val areaOfPizza = size.pow(2) * Math.PI
//        val price_per_inch_pizza = price/areaOfPizza
//    }
//}
//
//
//fun cheapestOption(pizzaWorth, PizzaWorth){
//
//}
//
//fun main() {
//    val pizza1 = Pizza()
//    print(pizza1.pizzaSize)
//    print(pizza1.pizzaPrice)
//    pizza1.getWorth(pizza1.pizzaSize)
//    // pizza2.checkWorth()
//    // cheapestOption()
//
//
//    val pizza2 = Pizza()
//    print(pizza2.pizzaSize)
//    print(pizza2.pizzaPrice)
//    print(pizza1.pizzaSize)
//
//}