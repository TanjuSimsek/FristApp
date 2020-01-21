package started

fun main() {


    val name:String? =null;
    val age:Int?=null;
    var number:Int?=null;
    var number2:Int?=null;

    number= readLine()!!.toInt()
    number2=readLine()!!.toInt()


    var result :Int?=0;
    //Burada result değişkenini toplarken !! işareti ile durumu ortadan kaldırdık.Ama NullPointerExcepcion hatası almaya devam ederim.
   // result=number!!+number2!!

    result=number+number2








}