class car {
    private String name;
    private int horsepower;

    // main constructor
    public car(String n, int horsepower) {
        name = n;
        setHorsepower(horsepower);
    }

    // constructor with only name
    public car(String n) {
        name = n;
        setHorsepower(80); // assign a default weak horsepower
    }

    // default constructor
    public car() {
        this.name = "test car default";
        setHorsepower(120); // assign a reasonable default horsepower
    }

    public String getName() {
        return name;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower < 100) {
            System.out.println("weak ahh car.");
        } else {
            this.horsepower = horsepower;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        car car1 = new car("Toyota", 150);
        car car2 = new car("Honda");   // triggers weak message
        car car3 = new car();          // uses default constructor

        System.out.println("Car 1: " + car1.getName() + ", Horsepower: " + car1.getHorsepower());
        System.out.println("Car 2: " + car2.getName() + ", Horsepower: " + car2.getHorsepower());
        System.out.println("Car 3: " + car3.getName() + ", Horsepower: " + car3.getHorsepower());
    }
}
