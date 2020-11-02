package invoicing

import items.Item

interface Invoiced {
    fun printInvoice(item: Item)
}