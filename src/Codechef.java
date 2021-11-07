
import java.util.*;
import java.lang.*;

class Codechef {
    /**
     * The current price of petrol is X rupees, and the current price of diesel is Y rupees. At the start of each month, the price
     * of petrol increases by A rupees and the price of diesel increases by B rupees.
     * <p>
     * Chef is curious to know which fuel costs less at the end of the Kth month. If petrol is cheaper than diesel at the end of Kth month,
     * then print PETROL. If diesel is cheaper than petrol at the end of the Kth month, then print DIESEL. If both the fuels have the same price at the end of the Kth month,
     * then print SAME PRICE.
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int CurrentPetrol = sc.nextInt();
            int CurrentDeisel = sc.nextInt();
            int petrolinc = sc.nextInt();
            int Deiselinc = sc.nextInt();
            int noofmonths = sc.nextInt();

            if ((CurrentPetrol + (petrolinc * noofmonths)) < (CurrentDeisel + (Deiselinc * noofmonths))) {
                System.out.println("PETROL");
            } else if ((CurrentPetrol + (petrolinc * noofmonths)) > (CurrentDeisel + (Deiselinc * noofmonths))) {
                System.out.println("DIESEL");
            } else {
                System.out.println("SAME PRICE");
            }

        }
    }
}