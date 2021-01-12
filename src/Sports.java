public class Sports extends Car{

    int accelerationToOneHundred;

    public int getAccelerationToOneHundred() {
        return accelerationToOneHundred;
    }

    public void setAccelerationToOneHundred(int accelerationToOneHundred) {
        this.accelerationToOneHundred = accelerationToOneHundred;
    }

    public Sports(String model, String type, int maxSpeed, int accelerationToOneHundred) {
        super(model, type, maxSpeed);
        this.accelerationToOneHundred = accelerationToOneHundred;
    }

}
