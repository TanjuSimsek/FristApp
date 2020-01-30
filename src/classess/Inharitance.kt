package classess

open class Shape {
    open val shape: String = "Empty"
    open val color: String = "Bluew"
    open fun Draw() {

        println(shape)

    }


}

open class Daire(override val shape: String) : Shape() {

    override val color: String
        get() = super.color


}

fun main() {
    val daire = Daire("0")
    println(daire.color)
}

class FinalShape {

    open val name: String = ""


}

class Circle : Daire("Circle") {

    override val color: String
        get() = super.color

}