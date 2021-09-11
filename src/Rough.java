import java.util.Scanner;

public class Rough {
   private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter no.of test cases");
        int testcases=scanner.nextInt();

        for(int a=0;a<testcases;a++) {

            System.out.println("Enter N A B");

            int x = scanner.nextInt();

            int y = scanner.nextInt();

            int z = scanner.nextInt();

            printyes(x,y,z,testcases);
        }
    }

    private static void printyes(int x, int y, int z, int testcases) {
        for(int a=0;a<testcases/2;a++) {
            System.out.println(x+" "+y+" "+z);
            System.out.println("enter the different X  values");
            String pq=scanner.next();

            char[] pqchar=new char[String.valueOf(x).length()];
            pqchar=pq.toCharArray();

            System.out.println(pqchar[1]);

        }
        }
}

//TODO  noof test cases
//TODO  2

//TODO  3 4 5
//TODO  011

//TODO  4 6 7
//TODO  1011
