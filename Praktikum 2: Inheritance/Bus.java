public class Bus extends Car {
    private int maxCapacity;
    public Bus (int maxCapacity) {
        super(6);
        this.maxCapacity = maxCapacity;
    }
    public int getMaxCapacity(){
        return this.maxCapacity;
    }
    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        String numwh = String.valueOf(getNumberOfWheels());
        String mil = String.valueOf(getMileage());
        String cap = String.valueOf(this.maxCapacity);
        String s = String.format("Number of Wheels: " + numwh + ", Mileage: " + mil + ", Max Capacity: " + cap);
        return s;
    }
    public long getPrice(){
        long hargajual;
        if ((this.getMileage() >= 0) && (this.getMileage() <= 10000)) {
            hargajual = 1000000 * maxCapacity;
            return hargajual;
        }
        else {
            hargajual = 500000 * maxCapacity;
            return hargajual;
        }
    }
}
