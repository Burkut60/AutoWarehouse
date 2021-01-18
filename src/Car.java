import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private String model;
    private String type;
    private int maxSpeed;

    public Car(String model, String type, int maxSpeed) {
        this.model = model;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
