/**
 * Main.java
 * [jelaskan kegunaan file ini]
 * @author [NIM] [Nama]
 */
import java.lang.System;
import java.util.Scanner;
/*Scanner userInput = new Scanner(System.in);
int panjang = userInput.nextInt();
System.out.println("panjang = " + panjang);*/
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int a = userInput.nextInt();
        if (a == 1) {
            int maxcap = userInput.nextInt();
            int mile = userInput.nextInt();            
            Car b = new Bus(maxcap);
            System.out.println(b.toString());
            System.out.println(b.getPrice());
            b.increaseMileage(mile);
            System.out.println(b.toString());
            System.out.println(b.getPrice());
        }
        else if (a == 2) {
            int numw = userInput.nextInt();
            boolean loaded = userInput.nextBoolean();
            int mile = userInput.nextInt();
            Car t = new Truck(numw, loaded);
            System.out.println(t.toString());
            System.out.println(t.getPrice());
            t.increaseMileage(mile);
            System.out.println(t.toString());
            System.out.println(t.getPrice());
        }
        else {
            int basepr = userInput.nextInt();
            int mile = userInput.nextInt();
            Car v = new Van(basepr);
            System.out.println(v.toString());
            System.out.println(v.getPrice());
            v.increaseMileage(mile);
            System.out.println(v.toString());
            System.out.println(v.getPrice());
        }
        userInput.close();
    }
}
