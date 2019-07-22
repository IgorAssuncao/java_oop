import java.util.ArrayList;

public class Aircraft {
    private String prefix;
    private String model;
    private String manufacturer;
    private ArrayList<Aircraft> aircraftArrayList;

    public Aircraft(String prefix, String model, String manufacturer) {
        this.aircraftArrayList = new ArrayList<>();
        this.prefix = prefix;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<Aircraft> getAircraftArrayList() {
        return aircraftArrayList;
    }

    public void setAircraftArrayList(ArrayList<Aircraft> aircraftArrayList) {
        this.aircraftArrayList = aircraftArrayList;
    }


}
