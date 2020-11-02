import java.math.BigDecimal

import invoicing.Invoice
import items.{AutoPart, HealthCare}
import returns.Returnable
import tracking.Tracking

object Main {
  def main(args: Array[String]): Unit = {
    val oilPanName = "Polish Karter z50"
    val oilPanDesc = "Aluminium, highest quality materials used."
    val oilPan = new AutoPart(new BigDecimal(20), oilPanName, oilPanDesc) with Invoice with Returnable with Tracking
    oilPan.addToCart()
    oilPan.getLocation
    oilPan.printInvoice(oilPan)
    System.out.println(oilPan.returnItem)

    val maskName = "Overpriced mask"
    val maskDesc = "Buy or die"
    val mask = new HealthCare(new BigDecimal(50), maskName, maskDesc) with Tracking with Invoice
    mask.checkSafetyStandards()
    mask.printInvoice(mask)
    mask.addToCart()
  }
}