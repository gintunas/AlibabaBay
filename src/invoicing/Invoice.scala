package invoicing

import items.Item

trait Invoice {
  def printInvoice(item: Item): Unit = {
    System.out.println("\n-------------------------Invoice-------------------------\n" + "Item: " + item.name + "\nPrice: " + item.price + "\n---------------------------------------------------------\n")
  }

}
