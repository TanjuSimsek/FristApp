package started

fun main() {

    var number=0;

    /*while (number<5){

        println(number)
        number++

    }*/

    for(value in 1..50){

        if(value%2==0){

            continue

        }
        println("\n$value")


    }

   returnLabel@for(value in 1..50){

        for(val2 in 0..10){

            if(val2==5){

                continue@returnLabel

            }


        }



    }




}