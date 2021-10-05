import java.util.Scanner;

/**
 * Chef has A
 *  units of solid and B
 *  units of liquid. He combines them to create a mixture. What kind of mixture does Chef produce: a solution, a solid, or a liquid?
 *
 * A mixture is called a:
 *
 * 1) A solution if A>0
 *  and B>0
 * ,
 *
 * 2) A solid if B=0
 * , or
 *
 * 3) A liquid if A=0
 **/

public class OctMixturechallenge {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {

            int A= sc.nextInt();
            int B= sc.nextInt();
            if(A>0 && B>0){
                System.out.println("Solution");
            } else if(B==0){
                System.out.println("Solid");
            } else {
                System.out.println("Liquid");
            }

            test--;
        }
    }

}
