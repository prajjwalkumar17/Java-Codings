import java.util.Scanner;

public class Rough {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no.of test cases");
        int testcases=scanner.nextInt();

        for(int a=0;a<testcases;a++) {
            System.out.println("Enter N A B");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int z = scanner.nextInt();

            for(int c=0;c<x;c++)
            {
                System.out.println("print");
            }

            printyes(x,y,z,testcases);
        }
    }

    private static void printyes(int x, int y, int z, int testcases) {
        for(int a=0;a<testcases/2;a++) {
            System.out.println(x+" "+y+" "+z+" "+testcases);


        }
        }
}

//TODO  noof test cases
//TODO  2

//TODO  3 4 5
//TODO  011

//TODO  4 6 7
//TODO  1011
