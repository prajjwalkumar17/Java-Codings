
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0){
            int A=sc.nextInt();
            int B=sc.nextInt();

            int C=sc.nextInt();

            int D=sc.nextInt();

            int E=sc.nextInt();

            int max=Math.max(Math.max(A,C),B);
            int min=Math.min(Math.min(A,B),C);

            int thirdno=A+B+C-(max+min);

            if(min<=E && max+thirdno<=D || max+min<=D && thirdno<=E || min+thirdno<=D && max<=E){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            test--;
        }
    }
}






