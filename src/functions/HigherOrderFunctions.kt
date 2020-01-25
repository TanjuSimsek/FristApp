package functions

import java.util.*
import kotlin.concurrent.schedule

fun main() {

    val surName: String = "abc"
    // printUserInfo("Tanju",5)
    /* printUserInfo(getName(),{

         surName -> "surname: $surName"

     },getAge())*/

    getItemClickListener { buttonName ->
        println("$buttonName tıklandı..")

    }
    val news = News()
    // news.getNewsFromServer()

}

fun getName(): String {

    return "Tanju"

}

fun getAge(): Int = 29
fun printUserInfo(name: String, getSurname: (surName: String) -> String, age: Int) {
//hihorderfunctions
    println("name: $name,age: $age")
    println(getSurname("AYŞE Can"))

}

fun getItemClickListener(onClick: (buttonName: String) -> Unit) {

    println("başla")
    Timer().schedule(3000) {

        onClick("Login")


    }
    println("bitti")


}


class News {

    fun getNewsType(newsType: NewsType): String {

        return when (newsType.toString()) {
//when expresion olark kullanımı
            NewsType.brekingNews -> "Breaking"
            else -> "Normal"


        }


    }

    class NewsType {
        companion object {

            val brekingNews = "Breaking News"
            val urgent = "urgent"
            val local = "local"
            val global = "global"

        }


    }

    fun News.getNewsFromServer(chanelType: String, newsType: NewsType, getNews: NewsType.(Int) -> Unit) {

        when (chanelType) {

            "Kanal D" -> {
                getNews(newsType, 1)

            }
            "Show" -> {
                getNews(newsType, 2)

            }

        }


    }


}

