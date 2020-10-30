package items

import java.math.BigDecimal

abstract class Item(val price: BigDecimal, val name: String, val description: String) {
  def addToCart(): Unit = System.out.println("Item: " + this.name + " added to cart.")
}