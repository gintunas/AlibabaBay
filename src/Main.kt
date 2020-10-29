import items.AutoPart
import java.math.BigDecimal

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val oilPan = AutoPart(BigDecimal(20), "Polish Karter z50", "Aluminium, highest quality materials used.")
        oilPan.addToCart()
        oilPan.location
        oilPan.printInvoice(oilPan)
        println(oilPan.returnItem())
    }
}