package items

import java.math.BigDecimal

import returns.Returnable
import tracking.Tracked

class Jewelry(override val price: BigDecimal, override val name: String, override val description: String)
  extends Item(price, name, description)
    with Returnable
    with Tracked