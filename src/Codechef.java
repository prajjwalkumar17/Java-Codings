
import java.util.*;
import java.lang.*;

class Codechef {
    /**Chef has X coins worth 1 rupee each and Y coins worth 2 rupees each. He wants to distribute all of these X+Y coins
     * to his two sons so that the total value of coins received by each of them is the same. Find out whether Chef will be able to do so.
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int onerupeecoins = sc.nextInt();
            int tworupeecoins = sc.nextInt();

            if(((onerupeecoins)+(tworupeecoins*2))%2==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}