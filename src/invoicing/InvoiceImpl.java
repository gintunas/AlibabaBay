package invoicing;

import items.Item;

public class InvoiceImpl implements Invoiced {

    @Override
    public void printInvoice(Item item) {
        System.out.println("\n-------------------------Invoice-------------------------\n" +
                "Item: " + item.name + "\nPrice: " + item.price +
                "\n---------------------------------------------------------\n");
    }
}
