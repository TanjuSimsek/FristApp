package functions

fun main() {

    val pi: Double = 3 + 0.14
    println(pi)
    val SchoolNumber: Int = 315
    println(SchoolNumber)
    val tcIdentityNumber: Long = 244669966
    println(tcIdentityNumber)

    /* log(pi)
     log(SchoolNumber)
     log(tcIdentityNumber)*/

    (3 + 0.14).log()
    1341.log()//ilgili value nin bir özelliği olarak çagırdım.LOG 2 de ise bir değişkene atamam gerekir ,yada print içine dogrudan yazmalısın.


    val result: Int = "3".explus2("5")
    val result2: Int = "3" explus "5"

    "3" explus "5" log3 ""

    val shape = Shape()
    shape.calculateArea(45.0)
    shape.main()

    println("asd4")


}

fun Number.log2(number: Number) {


    print(number)

}


fun Number.log() {


    println(this)

}

infix fun Number.log3(emptyParam: String) {


    println(this)

}

fun String.explus2(otherString: String): Int = this.toInt() + otherString.toInt()
infix fun String.explus(otherString: String): Int = this.toInt() + otherString.toInt()

class Shape {

    //fun calculateArea(edge:Int):Int{return edge*edge}
    fun calculateArea(edge: Int): Int = edge * edge //expresion yazılımı.Süslü parantezden kurtul = ile yaz.

    //bir extension funksiyon bir clasın uye fonksiyonu ile birlikte kullanmaya calısırsak uye fonksiyon calısır.
    fun Int.extoString() {

        toString()
        println("Sımsek")

    }

    fun extoString() {


        println("Tanju")
    }

    fun main() {

        3.extoString()

    }


}

fun Shape.calculateArea(edge: Double): Int {
    val result = edge * edge
    println(result)
    return result.toInt()

}







