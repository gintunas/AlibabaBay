package items

import java.math.BigDecimal

abstract class Item(var price: BigDecimal, var name: String, var description: String) {
    fun addToCart() {
        println("Item: " + name + " added to cart.")
    }

}