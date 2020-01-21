package started

fun main() {


    val countryCodeArray= arrayOf("tr","az","km")
    for(valu in 1..10){

        println(valu)


    }

    for (i in countryCodeArray.indices  ){

        println("$i .degeri :${countryCodeArray[i]}")

    }

    for ((index,value) in countryCodeArray.withIndex()  ){

        println("\n$index .degeri :$value")

    }

    repeat(5){

        print("Maho:")


    }

}