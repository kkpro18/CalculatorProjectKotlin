package OLD

class Calculator {
    fun calculate(): Float {
        print("Enter the first number: ")
        val num1 = readln().toFloat()
        print("Enter the second number: ")
        val num2 = readln().toFloat()
        print("Enter the operator: ")
        val operator = readln()
        var result = 0f
        when (operator) {
            "+" -> result = num1 + num2
            "-" -> result =  num1 - num2
            "*" -> result = num1 * num2
            "/" -> result = num1 / num2
            "%" -> result =  num1 % num2
        }
        return result
    }
}

fun main(args: Array<String>) {
    while (true){
        val calculator = Calculator()
        val result = calculator.calculate()
        print("The result is: $result\n")

        print("Do you want to perform more calculations (Y - Continue, Anything else - end program)? ")
        val choice = readln()
        if (choice == "Y"){
            continue
        } else {
            break
        }
    }
}