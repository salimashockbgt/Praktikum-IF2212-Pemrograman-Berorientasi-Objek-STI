public class Truck extends Car {
    private boolean loaded;
    public Truck(int numberOfWheels, boolean loaded){
        super(numberOfWheels);
        this.loaded = loaded;
    }
    public boolean isLoaded(){
        return this.loaded;
    }
    public void load(){
        this.loaded = true;
    }
    public void unload(){
        this.loaded = false;
    }
    public String toString(){
        String numwh = String.valueOf(getNumberOfWheels());
        String mil = String.valueOf(getMileage());
        String loads;
        if (this.loaded == true) {
            loads = "true";
        } else {
            loads = "false";
        }
        String s = String.format("Number of Wheels: " + numwh + ", Mileage: " + mil + ", Is Loaded: " + loads);
        return s;
    }
    public long getPrice(){
        long hargajual = 5000000 * getNumberOfWheels();
        return hargajual;
        }
    

}
