package singleton;

public class Animal {
    private static Animal instance;

    private String name;


    private Animal() {
        this.name = "Animal";
    }


    public static Animal getInstance() {
        if (instance == null) {
            instance = new Animal();
        }
        return instance;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
