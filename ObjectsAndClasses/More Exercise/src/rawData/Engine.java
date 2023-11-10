package rawData;

public class Engine {
    int engineSpeed;
    int enginePower;

    public Engine(int engineSpeed, int enginePower){
        this.enginePower = enginePower;
        this.engineSpeed = engineSpeed;
    }
    public void setEngineSpeed(int engineSpeed){
        this.engineSpeed = engineSpeed;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
