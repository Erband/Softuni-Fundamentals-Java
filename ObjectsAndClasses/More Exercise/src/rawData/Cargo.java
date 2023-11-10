package rawData;

public class Cargo {
    int cargoWeight;
    String cargoType;

    public Cargo(int cargoWeight, String cargoType){
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }
    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }
}
