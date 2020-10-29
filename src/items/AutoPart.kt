package items;

import invoicing.InvoiceImpl;
import invoicing.Invoiced;
import returns.ReturnImpl;
import returns.Returnable;
import tracking.Tracked;
import tracking.TrackingImpl;

import java.math.BigDecimal;

public class AutoPart extends Item implements Tracked, Invoiced, Returnable {
    private final InvoiceImpl invoiceImpl = new InvoiceImpl();
    private final ReturnImpl returnImpl = new ReturnImpl();
    private final TrackingImpl trackingImpl = new TrackingImpl();

    public AutoPart(BigDecimal price, String name, String description) {
        super(price, name, description);
    }

    @Override
    public void printInvoice(Item item) {
        invoiceImpl.printInvoice(item);
    }

    @Override
    public String returnItem() {
        return returnImpl.returnItem();
    }

    @Override
    public String getLocation() {
        return trackingImpl.getLocation();
    }


}
