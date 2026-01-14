package HasARelationShip;

class Engine {
    String engineType;
    int horsePower;

    Engine(String engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    void showEngine() {
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horse Power: " + horsePower);
    }
}

class Car {
    private Engine engine;   // composition

    Car(String engineType, int horsePower) {
        engine = new Engine(engineType, horsePower);
    }

    void showCarDetails() {
        System.out.println("Car Details:");
        engine.showEngine();
    }
}

public class Practice01 {
    public static void main(String[] args) {

        Car c = new Car("CNG", 400);
        c.showCarDetails();
    }
}
