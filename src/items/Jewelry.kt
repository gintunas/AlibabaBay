package items

import returns.ReturnImpl
import returns.Returnable
import tracking.Tracked
import tracking.TrackingImpl
import java.math.BigDecimal

class Jewelry(price: BigDecimal, name: String, description: String)
    : Item(price, name, description),
        Returnable by ReturnImpl(),
        Tracked by TrackingImpl()