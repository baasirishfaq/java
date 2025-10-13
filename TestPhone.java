class Phone {
    private String model;
    private int battery;

    public void setBattery(int percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid battery level");
        } else {
            battery = percent;
        }
    }

    public int getBattery() {
        return battery;
    }

    public void setModel(String model){
        if(model == null)
        {
            this.model = "NOKIA default";
        }
        else{
            this.model = model;
        }
    }

    public String getModel(){
        return model;
    }
}

public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.setBattery(80);
        p.setModel("samsung");
        System.out.println(p.getBattery() +" "+ p.getModel());

        p.setBattery(150);
        System.out.println(p.getBattery());
    }
}
