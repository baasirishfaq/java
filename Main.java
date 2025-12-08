class Car {
    Car() {
        System.out.println("Car constructor");
    }

    void engine() {
        System.out.println("V6 engine");
    }
}

class Tesla extends Car {
    Tesla() {
        System.out.println("Tesla constructor");
    }

    @Override
    void engine() {
        super.engine();
        System.out.println("Electric engine");
    }
}

public class Main {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.engine();
    }
}
