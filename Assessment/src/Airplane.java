public class Airplane extends Aircraft {
    private int seatsQuantity;
    private String companyName;

    public Airplane(String prefix, String model, String manufacturer, int seatsQuantity, String companyName) {
        super(prefix, model, manufacturer);
        this.seatsQuantity = seatsQuantity;
        this.companyName = companyName;
    }

    public int getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setSeatsQuantity(int seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "seatsQuantity=" + seatsQuantity +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
