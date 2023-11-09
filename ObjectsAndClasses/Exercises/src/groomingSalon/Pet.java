package groomingSalon;

public class Pet {
    String name;
    int age;
    String owner;

    public Pet(String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return this.owner;
    }

    public String toString(){
        return name + " " + age + " - " + "(" + owner +")";
    }
}
