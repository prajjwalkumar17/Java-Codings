
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {

            int A= sc.nextInt();
            int B= sc.nextInt();
            int C= sc.nextInt();
            int D= sc.nextInt();
            if(A+B+C<=D){
                System.out.println("1");
            } else if( (A+B<=D && C<=D) || (A+C<=D && B<=D) ||(B+C<=D && A<=D)){
                System.out.println("2");
            } else {
                System.out.println("3");
            }



            test--;
        }
    }



}




