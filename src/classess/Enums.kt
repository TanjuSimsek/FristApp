package classess

enum class DirectionType(val code: Int) {


    EAST(100) {
        override fun fullValue() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return "East"
        }

    },
    WEST(20) {
        override fun fullValue() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    SOUTH(300) {
        override fun fullValue() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    NORTH(400) {
        override fun fullValue() {
            println("name: ${NORTH.name},position:${NORTH.ordinal}")
        }
    };

    abstract fun fullValue()


}

fun main() {
    DirectionType.EAST
    DirectionType.NORTH
    DirectionType.EAST
    setDirection("Maho", 1)
    setDirection(DirectionType.EAST.toString(), DirectionType.EAST.ordinal)
    setDirection(DirectionType.NORTH.name, DirectionType.NORTH.ordinal)
    DirectionType.NORTH.fullValue()
    println()
    DirectionType.NORTH.code.log()

}

fun setDirection(direction: String, position: Int) {

    println("direction:$direction,Position: $position")

}

fun Int.log() {

    println("Direction Code: $this")

}