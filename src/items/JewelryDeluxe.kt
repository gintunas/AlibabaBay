package items

import returns.ReturnImpl
import returns.Returnable
import tracking.Tracked
import tracking.TrackingImpl
import java.math.BigDecimal

class JewelryDeluxe(price: BigDecimal, name: String, description: String, private val returnImpl: ReturnImpl, private val trackingImpl: TrackingImpl)
    : Jewelry(price, name, description),
        Returnable by returnImpl,
        Tracked by trackingImpl