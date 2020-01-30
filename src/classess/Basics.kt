package classess

class Car2 constructor(carType: String) {

    var carType: String = carType
    var carColor: String = ""
    val carType2: String

    init {

        this.carType = carType
        this.carColor = ""
        carType2 = ""

    }

    constructor(carType: String, carColor: String) : this(carType) {

        this.carType = carType
        this.carColor = carColor

    }

    fun printTypeColor() {

        println("carType: $carType,carColor:$carColor")

    }


}

class Car3 {

    init {

        println("assss")

    }


    constructor(type: String, color: String) {

        println("tanju")

    }

    init {

        println("123")

    }


}

class Car(type: String = "") {

    var carType: String = "Metal".also { println(it) }

    init {

        //primariy controcter çalıştığında çalışıcak.
        println("Primary Controctor: $type")


    }

    //secondry constroter
    constructor(type: String, carColor: String) : this(type)

    constructor(type: String, carColor: String, count: Int) : this(type)

}

fun main() {
    /* val CarIntance2=Car()
     val carInstance=Car("Mini")
    val carInstance3=Car("Renoult",carColor = "red")*/
    val car1 = Car3(type = "asd", color = "blue")

}