package functions

fun main() {


    calculateA()


}

fun calculateA() {

    println("asd..")
    /* val number= readLine()!!.toInt()
     val number1= readLine()!!.toInt()
     val result=number+number1
     println("$result")

     val number3= readLine()!!.toInt()
     val number2= readLine()!!.toInt()
     val result1=number2+number3
     print("$result1")*/

    fun getVal() {


        val number = readLine()!!.toInt()
        val number1 = readLine()!!.toInt()
        val result = number + number1
        println("$result")


    }//local function metod cağrımından kesın olark once cağrılması gerekir.

    getVal()
    getVal()
    //Local function burada çagrılamaz.

    println("EndOfLİfe")

}

/*fun getVal() {


    val number = readLine()!!.toInt()
    val number1 = readLine()!!.toInt()
    val result = number + number1
    println("$result")


}*/
class Car {
    //member functions

    fun setColor(colorId: Int) {


    }


    fun <T> getolor(colorId: T) {
        //generic functions


    }


}