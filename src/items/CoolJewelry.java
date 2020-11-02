package items;

import returns.ReturnImpl;
import returns.Returnable;
import tracking.Tracked;
import tracking.TrackingImpl;

import java.math.BigDecimal;

public class CoolJewelry extends Jewelry implements Returnable, Tracked {
    private final ReturnImpl returnImpl;
    private final TrackingImpl trackingImpl;

    public CoolJewelry(BigDecimal price, String name, String description, ReturnImpl returnImpl, TrackingImpl trackingImpl) {
        super(price, name, description);
        this.returnImpl = returnImpl;
        this.trackingImpl = trackingImpl;
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
