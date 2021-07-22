fun main() {
	val squareCabin = SqureCabin(6)
    
    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
}

class SqureCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean {
        return residents < capacity
    }
}
