import java.util.Scanner;

public class OCTLuckyno {public static void main(String[] args) throws java.lang.Exception {
    /*
     *Chef buys a lottery ticket that has a 3 digit code associated with it. He thinks that digit 7 is his lucky digit and brings him good luck. Chef will win some amount in the lottery if at least one of the digits of the lottery ticket is 7.

Given three digits A, B, and C of the lottery ticket, tell whether Chef wins something or not?
     * */
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while (test --> 0) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A==7 || B==7 ||C==7){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
}