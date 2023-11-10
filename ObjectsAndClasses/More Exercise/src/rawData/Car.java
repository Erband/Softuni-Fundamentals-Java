package rawData;

import java.sql.Array;

public class Car {
    String model;
    Engine engine;
    Cargo cargo;
    Tire[] tires = new Tire[4];

    public Car(String model, Engine engine, Cargo cargo, Tire[] tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public boolean lowPressure(){
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) return true;
        }
        return false;
    }

    public boolean highEnginePower(){
        return this.engine.getEnginePower() > 250;
    }

}
