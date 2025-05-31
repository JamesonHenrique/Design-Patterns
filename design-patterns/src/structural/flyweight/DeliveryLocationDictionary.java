package structural.flyweight;
import java.util.Map;

public class DeliveryLocationDictionary {
    private final Map<String, DeliveryLocation> locations;

    public DeliveryLocationDictionary(Map<String, DeliveryLocation> locations) {
        this.locations = locations;
    }

    public Map<String, DeliveryLocation> getLocations() {
        return locations;
    }

    public DeliveryLocation getLocation(String key) {
        return locations.get(key);
    }

    public void addLocation(String key, DeliveryLocation location) {
        locations.put(key, location);
    }
}
