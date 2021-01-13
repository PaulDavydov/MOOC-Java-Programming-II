import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    public VehicleRegistry() {
        registry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if(registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate,owner);
        return true;
    }
    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        }
        return null;
    }
    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        if(!registry.containsKey(licensePlate)) {
            return false;
        }
        return false;
    }
    public void printLicensePlates() {
        for (LicensePlate i : registry.keySet()) {
            System.out.println(i);
        }
    }
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (LicensePlate i : registry.keySet()) {
            if(owners.contains(registry.get(i))) {
                continue;
            }
            owners.add(registry.get(i));
        }
        for (String i : owners) {
            System.out.println(i);
        }
    }
}
