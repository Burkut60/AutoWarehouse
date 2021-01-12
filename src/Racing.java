public class Racing extends Sports{

    int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Racing(String model, String type, int maxSpeed, int accelerationToOneHundred, int power) {
        super(model, type, maxSpeed, accelerationToOneHundred);
        this.power = power;
    }

}
