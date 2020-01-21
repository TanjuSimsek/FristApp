package functions

fun main() {


    val say= getValue("1.Sayiyi Girirniz")
    val say2= getValue("2.Sayiyi Girirniz")
    val say3= getValue()//default arguments fun içerinsde String=" " default değer alıyor.

   // println("2.Sayıyı Gir:")
  //  val say2= readLine()!!.toInt()

    println("1.Matematik Sembol Gir:")
   // val op= readLine()

  /* val result= when(op){

        "+"-> say+say2
       "-"-> say-say2
       "*"-> say*say2
       "/"-> say/say2
        else ->0

    }*/
    print("Result:${callucate(say,say2)}")
    reformatString("Tanju",true,7,"tr")
    reformatString("Tanju",size=7,lang = "az")//named arguments
    getUserInfo(name = "Tanju",surName = "Şimşek",city = "a",country = "a")
    getUserInfo2("a","b","c",key = 5)
    getUserInfo2(*arrayOf("a","b"),key = 5)


}

fun getValue(printMesage:String=""):Int{

    println(printMesage)
    return  readLine()!!.toInt()



}
fun callucate(say :Int,say2:Int):Double{

    val result= when(readLine()!!){

        "+"-> say+say2
        "-"-> say-say2
        "*"-> say*say2
        "/"-> say/say2
        else ->0

    }
    return result.toDouble()


}
fun reformatString(message:String,isUpperCase:Boolean=false,size:Int,lang:String="tr"){


}

fun getUserInfo(name: String, surName: String, city: String, country: String) {


}

fun getUserInfo2(vararg userInfo: String, key: Int) {

    userInfo


}

val userList = arrayOfNulls<String>(5)
fun getListCount(): Int {

    return 0
}