package Testing_Assignment_5.Exercise3;

public class Car {
    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    class Engine {
        private String enginetype;

        public Engine(String enginetype) {
            this.enginetype = enginetype;
        }

        public void setEnginetype(String enginetype) {
            this.enginetype = enginetype;
        }

        public String getEnginetype() {
            return enginetype;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Mazda","8WD");
        Engine engine = car.new Engine("Crysler");

        System.out.println("Car name: " + car.getName());
        System.out.println("Car type: " + car.getType());
        System.out.println("Engine type: " + engine.getEnginetype());
    }
}
