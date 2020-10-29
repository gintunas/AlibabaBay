package items

import invoicing.InvoiceImpl
import invoicing.Invoiced
import returns.ReturnImpl
import returns.Returnable
import tracking.Tracked
import tracking.TrackingImpl
import java.math.BigDecimal

class AutoPart(price: BigDecimal, name: String, description: String)
    : Item(price, name, description),
        Tracked by TrackingImpl(),
        Invoiced by InvoiceImpl(),
        Returnable by ReturnImpl()