package functions

fun main() {

    val isStudent = false
    val isaMale = true
    if (isStudent and isaMale) {

        print("Ögrenci Olmayan abc")


    }

    val a = AwesomeClass()
    a dowlandImage "asd"
    val number = 5
    // if(number+number*2 AwesomeClass.specialtyPlus(4)) infix metod bütün işlemlerin hepsi infix metoda göre önceliklidir.
    //mantıksal operetorlerde infix metod önceliklidir.|| &&  == gbi.

    if (number + number - 2 * (a specialtyPlus 4) == 5) {


    }


}

class AwesomeClass {

    infix fun dowlandImage(ImageUrl: String) {


    }

    infix fun <T> dowlandImage2(ImageUrl: T) {


    }


    fun logWhen(a: String) {

        dowlandImage(a)
        this dowlandImage2 a
        //infix içinde infix çagırmacalar yavrum


    }

    infix fun specialtyPlus(number: Int): Int {
        return number


    }


}