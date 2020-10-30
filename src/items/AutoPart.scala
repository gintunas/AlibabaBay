package items

import java.math.BigDecimal

import invoicing.Invoiced
import returns.Returnable
import tracking.Tracked

class AutoPart(override val price: BigDecimal, override val name: String, override val description: String)
  extends Item(price, name, description)
    with Tracked
    with Invoiced
    with Returnable