import invoicing.InvoiceImpl
import items.AutoPartDeluxe
import items.HealthCareDeluxe
import returns.ReturnImpl
import tracking.TrackingImpl
import java.math.BigDecimal

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val oilPanName = "Polish Karter z50"
        val oilPanDesc = "Aluminium, highest quality materials used."
        val oilPan = AutoPartDeluxe(BigDecimal(20), oilPanName, oilPanDesc, TrackingImpl(), InvoiceImpl(), ReturnImpl())
        oilPan.addToCart()
        oilPan.location
        oilPan.printInvoice(oilPan)
        println(oilPan.returnItem())
        val maskName = "Overpriced mask"
        val maskDesc = "Buy or die"
        val mask = HealthCareDeluxe(BigDecimal(50), maskName, maskDesc, InvoiceImpl(), TrackingImpl())
        mask.checkSafetyStandards()
        mask.addToCart()
    }
}