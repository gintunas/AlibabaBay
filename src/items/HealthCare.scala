package items

import java.math.BigDecimal

import invoicing.Invoiced
import tracking.Tracked

class HealthCare(override val price: BigDecimal, override val name: String, override val description: String)
  extends Item(price, name, description)
    with Invoiced
    with Tracked