package invoicing

import items.Item

class InvoiceImpl : Invoiced {
    override fun printInvoice(item: Item) {
        println("""
    
    -------------------------Invoice-------------------------
    Item: ${item.name}
    Price: ${item.price}
    ---------------------------------------------------------
    
    """.trimIndent())
    }
}