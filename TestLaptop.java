class Laptop {
    private String brand;
    private int battery;

    // default constructor
    public Laptop() {
        setBrand("Unknown");
        setBattery(0);
    }

    // constructor with one argument
    public Laptop(String brand) {
        setBrand(brand);
        setBattery(50);
    }

    // constructor with two arguments
    public Laptop(String brand, int battery) {
        setBrand(brand);
        setBattery(battery);
    }

    public void setBrand(String brand){
        if(brand == null || brand.length() == 0 )
        {
            this.brand = "default brand";
        }
        else{
            this.brand = brand;
        }
    }

    public void setBattery(int b){
        if(b > 100 || b < 0)
        {
            System.out.println("should be 0-100");
        }
        else{
            battery = b;
        }
    }

    public int getBattery(){
        return battery;
    }
    public String getBrand()
    {
        return brand;
    }
}

public class TestLaptop {
    public static void main(String[] args) {
        Laptop a = new Laptop();
        Laptop b = new Laptop("Dell");
        Laptop c = new Laptop("HP", 120);
        Laptop d = new Laptop("", 80);

        System.out.println(a.getBrand() + " " + a.getBattery());
        System.out.println(b.getBrand() + " " + b.getBattery());
        System.out.println(c.getBrand() + " " + c.getBattery());
        System.out.println(d.getBrand() + " " + d.getBattery());
    }
}
