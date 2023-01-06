fun main(args: Array<String>) {
    val number1 = 10.5
    val number2 = 5.5
    val result:Double

    println("Sum = " + add(10,5))
    mathRoot()
    mathPower()
    result = addNumber(number1,number2)
    println("Sum = $result")

    val name:String
    name = getName("Mark","Zuckerberg")
    println("Mr. $name")

    val std:String
    std = student(101,age = 45)
    println(std)

    val myLambda: (Int) -> Unit ={ s:Int-> println(s)}
    multiply(5, 10, myLambda)

//    Lambda function
    val total:Int = sum(20,10)
    println("Sum = $total")

//    Inline Function
    myFunction({ println("Inline function parameter") })

//    Nigh order function

    println("Div = " + calculate(50,10,::div))
}