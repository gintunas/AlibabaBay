package items;

import invoicing.InvoiceImpl;
import invoicing.Invoiced;
import tracking.Tracked;
import tracking.TrackingImpl;

import java.math.BigDecimal;

public class HealthCare extends Item implements Invoiced, Tracked {
    private final InvoiceImpl invoiceImpl = new InvoiceImpl();
    private final TrackingImpl trackingImpl = new TrackingImpl();

    public HealthCare(BigDecimal price, String name, String description) {
        super(price, name, description);
    }

    @Override
    public void printInvoice(Item item) {
        invoiceImpl.printInvoice(item);
    }

    @Override
    public String getLocation() {
        return trackingImpl.getLocation();
    }


}
