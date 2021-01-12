public class Cargo extends Car {
    int luggage;

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    Cargo(String model, String type, int maxSpeed, int luggage) {
        super(model, type, maxSpeed);
        this.luggage = luggage;
    }

}
