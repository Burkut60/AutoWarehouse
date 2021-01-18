import java.io.Serializable;

public class Passenger extends Car implements Serializable {
    int passengersMax;

    public int getPassengersMax() {
        return passengersMax;
    }

    public void setPassengersMax(int passengersMax) {
        this.passengersMax = passengersMax;
    }

    public Passenger(String model, String type, int maxSpeed, int passengersMax) {
        super(model, type, maxSpeed);
        this.passengersMax = passengersMax;
    }
}
