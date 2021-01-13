import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;
    public StorageFacility() {
        facility = new HashMap<>();
    }
    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit,new ArrayList<>());
        ArrayList<String> items = this.facility.get(unit);
        items.add(item);
    }
    public ArrayList<String> contents(String storageUnit) {
        if(facility.containsKey(storageUnit)) {
            return facility.get(storageUnit);
        }
        return new ArrayList<String>();
    }
    public void remove(String storageUnit, String item) {
        facility.get(storageUnit).remove(item);
        if (facility.get(storageUnit).isEmpty()) {
            facility.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> names = new ArrayList<>();
        for ( String i : facility.keySet()) {
            if(facility.get(i).isEmpty()){
                continue;
            }
            names.add(i);
        }
        return names;
    }

}
