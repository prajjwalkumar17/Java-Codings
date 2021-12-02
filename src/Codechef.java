
import java.util.*;
import java.lang.*;

class Codechef { public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a no to print wheather it is pallindrone or not");
    int n=scanner.nextInt();
    System.out.println(pallindrone(n));
    System.out.println(factorial(n));

}

    private static int factorial(int n) {
    int tmp=0;
    while (n != 0) {
        tmp=n*factorial(n-1);
    }
    return tmp;
    }

    private static Boolean pallindrone(int n) {
        int rev=0;
        int tmp=n;
        while (tmp!= 0){
            int ld =tmp%10;
            rev=rev*10+ld;
            tmp=tmp/10;
        }
        System.out.println(rev);
        return (rev == n);
    }
}
