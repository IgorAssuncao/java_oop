import java.util.ArrayList;

public class City {
    private String name;
    private double dimension;
    private ArrayList<City> cityBorders;

    public City(String name, double dimension) {
        this.cityBorders = new ArrayList<>();
        this.name = name;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public ArrayList<City> getCityBorders() {
        return cityBorders;
    }

    public void setCityBorders(ArrayList<City> cityBorders) {
        this.cityBorders = cityBorders;
    }

    public boolean equals(City city) {
        return city != null && (this.getName().equals(city.getName()) && this.getDimension() == city.getDimension());
    }

    public boolean cityInBorder(City city) {
        for (City cityAux: this.getCityBorders()) {
            if (city.equals(cityAux)) return true;
        }
        return false;
    }

    public ArrayList<City> getCommonNeighbours(City city) {
        ArrayList<City> commonNeighbours = new ArrayList<>();

        for (City cityAux: this.getCityBorders()) {
            for (City otherCity: city.getCityBorders()) {
                if (cityAux.equals(otherCity)) {
                    commonNeighbours.add(otherCity);
                }
            }
        }

        return commonNeighbours;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", dimension=" + dimension +
                ", cityBorders=" + cityBorders +
                '}';
    }
}
