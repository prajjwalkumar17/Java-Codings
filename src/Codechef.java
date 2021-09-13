
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
            int N=sc.nextInt();

            int X=sc.nextInt();

            int[] array = new int[N];
            for(int i=0;i<N;i++){
                array[i]=sc.nextInt();
            }

            System.out.println(N+" "+X+" "+array[1]);
            test--;
        }
    }
}






