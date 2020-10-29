package tracking;

public class TrackingImpl implements Tracked {
    private String location = "Not shipped yet.";

    @Override
    public String getLocation() {
        return location;
    }
}
