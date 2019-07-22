public class Helicopter extends Aircraft {
    public enum HelicopterType {
        RESCUE, AIR_TAXI, COAST_GUARD
    }

    public HelicopterType helicopterType;

    public Helicopter(String prefix, String model, String manufacturer, HelicopterType helicopterType) {
        super(prefix, model, manufacturer);
        this.helicopterType = helicopterType;
    }

    public HelicopterType getHelicopterType() {
        return helicopterType;
    }

    public void setHelicopterType(HelicopterType helicopterType) {
        this.helicopterType = helicopterType;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "helicopterType=" + helicopterType +
                '}';
    }
}
