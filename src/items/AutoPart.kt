package items

import java.math.BigDecimal

open class AutoPart(price: BigDecimal, name: String, description: String) : Item(price, name, description) {
    fun showSupportedModels() {
        println("\nHonda Civic V,\nHonda Accord VI")
    }

    fun printWarrantySeal() {
        println("ACBXMKJLLI142428AGHSD")
    }
}