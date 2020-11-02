package items;

import invoicing.Invoiced;
import returns.Returnable;
import tracking.Tracked;

import java.math.BigDecimal;

public class CoolAutoPart extends AutoPart implements Tracked, Invoiced, Returnable {
    private final Tracked trackingImpl;
    private final Invoiced invoiceImpl;
    private final Returnable returnImpl;

    public CoolAutoPart(BigDecimal price, String name, String description, Tracked trackingImpl, Invoiced invoiceImpl, Returnable returnImpl) {
        super(price, name, description);
        this.trackingImpl = trackingImpl;
        this.invoiceImpl = invoiceImpl;
        this.returnImpl = returnImpl;
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
