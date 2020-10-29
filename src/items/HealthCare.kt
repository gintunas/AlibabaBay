package items

import invoicing.InvoiceImpl
import invoicing.Invoiced
import tracking.Tracked
import tracking.TrackingImpl
import java.math.BigDecimal

class HealthCare(price: BigDecimal, name: String, description: String)
    : Item(price, name, description),
        Invoiced by InvoiceImpl(),
        Tracked by TrackingImpl()