package items

import invoicing.Invoiced
import tracking.Tracked
import java.math.BigDecimal

class HealthCareDeluxe(price: BigDecimal, name: String, description: String, private val invoiceImpl: Invoiced, private val trackingImpl: Tracked)
    : HealthCare(price, name, description),
        Invoiced by invoiceImpl,
        Tracked by trackingImpl