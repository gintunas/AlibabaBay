import invoicing.InvoiceImpl
import items.CoolAutoPart
import items.CoolHealthCare
import returns.ReturnImpl
import tracking.TrackingImpl
import java.math.BigDecimal

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val oilPanName = "Polish Karter z50"
        val oilPanDesc = "Aluminium, highest quality materials used."
        val oilPan = CoolAutoPart(BigDecimal(20), oilPanName, oilPanDesc, TrackingImpl(), InvoiceImpl(), ReturnImpl())
        oilPan.addToCart()
        oilPan.location
        oilPan.printInvoice(oilPan)
        println(oilPan.returnItem())
        val maskName = "Overpriced mask"
        val maskDesc = "Buy or die"
        val mask = CoolHealthCare(BigDecimal(50), maskName, maskDesc, InvoiceImpl(), TrackingImpl())
        mask.checkSafetyStandards()
        mask.addToCart()
    }
}