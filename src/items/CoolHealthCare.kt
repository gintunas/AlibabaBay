package items;

import invoicing.Invoiced;
import tracking.Tracked;

import java.math.BigDecimal;

public class CoolHealthCare extends HealthCare implements Invoiced, Tracked {
    private final Invoiced invoiceImpl;
    private final Tracked trackingImpl;

    public CoolHealthCare(BigDecimal price, String name, String description, Invoiced invoiceImpl, Tracked trackingImpl) {
        super(price, name, description);
        this.invoiceImpl = invoiceImpl;
        this.trackingImpl = trackingImpl;
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
