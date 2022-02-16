

/**
 * Car.java
 * [Jelaskan kegunaan class ini]
 * @author [18220054] [Salimatussholati A]
*/
public abstract class Car {
    private int numberOfWheels;
    private long mileage;
    
    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;
    }
    
    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels
        return this.numberOfWheels; 
    }
  
    public long getMileage() {
        // Mengembalikan atribut mileage
        return this.mileage;
    }
    
    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        this.mileage = this.mileage + increment;
    }
  
    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        String numwh = String.valueOf(this.numberOfWheels);
        String mil = String.valueOf(this.mileage);
        String s = String.format("Number of Wheels: " + numwh + ", Mileage: " + mil);
        return s;
    }
  
    public abstract long getPrice();
}
  