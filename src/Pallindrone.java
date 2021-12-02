import java.util.Scanner;

public class Pallindrone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a no to print wheather it is pallindrone or not");
        int n=scanner.nextInt();
        pallindrone(n);
    }

    private static Boolean pallindrone(int n) {
        int rev=0;
        int tmp=n;
        while (tmp-- > 0){
            int ld =tmp%10;
            rev=rev*10+ld;
            tmp=tmp/10;
        }
        return (rev == n);
    }
}
