package items

import invoicing.Invoiced
import returns.Returnable
import tracking.Tracked
import java.math.BigDecimal

class AutoPartDeluxe(price: BigDecimal, name: String, description: String, private val trackingImpl: Tracked, private val invoiceImpl: Invoiced, private val returnImpl: Returnable)
    : AutoPart(price, name, description),
        Tracked by trackingImpl,
        Invoiced by invoiceImpl,
        Returnable by returnImpl