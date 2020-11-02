package items

import java.math.BigDecimal

open class HealthCare(price: BigDecimal, name: String, description: String) : Item(price, name, description) {
    fun checkSafetyStandards() {
        println("Highest Klass 1")
    }

    fun checkMinimalUsersAge(): Int {
        return 11
    }
}