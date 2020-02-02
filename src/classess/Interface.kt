package classess

interface AnimalEvent {
    val animalName: String
    fun moved(isFly: Boolean, isSwimming: Boolean, isWalk: Boolean)
    fun makeSound() {

        println("Make a sound")


    }

    fun eat(isCarnivorous: Boolean)


}

interface WallksEvent {

    fun slowSpeedWalk()
    fun fastSpeedWalk()


}

class Fish : AnimalEvent {
    override val animalName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun moved(isFly: Boolean, isSwimming: Boolean, isWalk: Boolean) {

    }

    //override fun makeSound() {
    //body olduğu için overide etmek zorunda degılsın
    //  }

    override fun eat(isCarnivorous: Boolean) {

    }

}

class Bird : AnimalEvent {
    override val animalName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun moved(isFly: Boolean, isSwimming: Boolean, isWalk: Boolean) {

    }

    override fun eat(isCarnivorous: Boolean) {

    }


}

class Cats : Animal() {

    override fun moved(isFly: Boolean, isSwimming: Boolean, isWalk: Boolean) {

        //miras alındıgında metodları override etmek zorunda değilim edebilirimde super ile degerlere super ile erşebilirm.

    }

}

open class Animal {

    open fun moved(isFly: Boolean, isSwimming: Boolean, isWalk: Boolean) {

        //miras alındıgında metodları override etmek zorunda değilim edebilirimde super ile degerlere super ile erşebilirm.

    }


}

open class Plant : Animal(), AnimalEvent, WallksEvent {
    override val animalName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun eat(isCarnivorous: Boolean) {

    }

    override fun slowSpeedWalk() {

    }

    override fun fastSpeedWalk() {

    }


}

abstract class BaseAnimal {

    abstract val name: String
    open val animalType: String = ""
    abstract fun printName()

}

class Sivas(override val name: String) : BaseAnimal() {


    override val animalType: String
        get() = super.animalType

    override fun printName() {


    }


}