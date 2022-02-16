public class Van extends Car{
    private long basePrice;
    public Van(long basePrice){
        super(4);
        this.basePrice = basePrice;
    }
    public long getPrice(){
        if ((getMileage() >= 0) && (getMileage() <= 1000)) {
            return this.basePrice;
        }
        else if ((getMileage() > 1000) && (getMileage()<=10000)){
            return (long)Math.floor(this.basePrice * 0.75);
        }
        else {
            return (long)Math.floor(this.basePrice / 2);
        }
    }

}
