package items;

import returns.ReturnImpl;
import returns.Returnable;
import tracking.Tracked;
import tracking.TrackingImpl;

import java.math.BigDecimal;

public class Jewelry extends Item implements Returnable, Tracked {
    private final ReturnImpl returnImpl = new ReturnImpl();
    private final TrackingImpl trackingImpl = new TrackingImpl();

    public Jewelry(BigDecimal price, String name, String description) {
        super(price, name, description);
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
