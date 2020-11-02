package items

import java.math.BigDecimal

open class Jewelry(price: BigDecimal, name: String, description: String) : Item(price, name, description) {
    fun printGoldQtInAlloy() {
        println("1 kg")
    }

    fun printWhereGoldIsFrom() {
        println("Java Island")
    }
}