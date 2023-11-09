package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    List<Pet> data;
    int capacity;

    public GroomingSalon(int capacity){
        this.capacity = capacity;
        this.data = new ArrayList<>(capacity);
    }

    public void add(Pet pet){
        if (capacity > 0) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name){

        for(int i = 0 ; i < this.data.size(); i++){
            if (name.equals( data.get(i).getName()) ){
                this.data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner){
        for (Pet pet : this.data){
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }

        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder statistics = new StringBuilder("The grooming salon has the following clients:\n");

        for (Pet pet : this.data){
            statistics.append(pet.getName()).append("  ").append(pet.getOwner()).append("\n");
        }

        return statistics.toString();
    }
}
