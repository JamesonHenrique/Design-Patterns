package structural.flyweight;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DeliveryFactory {
    private final Map<String, DeliveryLocation> locations = new HashMap<>();

    private String createId(DeliveryLocationData data) {
        return String.join("_",
                data.getStreet().replaceAll("\\s+", "").toLowerCase(Locale.ROOT),
                data.getCity().replaceAll("\\s+", "").toLowerCase(Locale.ROOT)
        );
    }

    public DeliveryLocation makeLocation(DeliveryLocationData data) {
        String key = createId(data);
        if (locations.containsKey(key)) {
            return locations.get(key);
        }

        DeliveryLocation location = new DeliveryLocation(data);
        locations.put(key, location);
        return location;
    }
    public Map<String, DeliveryLocation> getLocations() {
        return locations;
    }


}
