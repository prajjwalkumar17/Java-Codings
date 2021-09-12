/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static Scanner scanner=new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            int testcases = scanner.nextInt();
            int[] result = new int[testcases];
            if (testcases == 1) {


                int N = scanner.nextInt();

                int A = scanner.nextInt();

                int B = scanner.nextInt();
                String S = scanner.next();
                char[] Schar = new char[String.valueOf(N).length()];
                Schar = S.toCharArray();
                int counttimeforinterdistrict = 0;
                int countimeforinterstate = 0;
                for (int tt = 0; tt < N; tt++) {
                    int xr = Integer.parseInt(String.valueOf(Schar[tt]));
                    if (xr == 0) {
                        counttimeforinterdistrict++;
                    } else if (xr == 1) {
                        countimeforinterstate++;
                    }
                }
                System.out.println(A * counttimeforinterdistrict + B * countimeforinterstate);
            }

            else {
                for (int a = 0; a < testcases; a++) {
                    int N = scanner.nextInt();

                    int A = scanner.nextInt();

                    int B = scanner.nextInt();

                    result[a] = printyes(N, A, B, testcases);
                }
                for (int ui = 0; ui < testcases; ui++) {
                    System.out.println(result[ui]);

                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;

        }
        // your code goes here
    }
    private static int printyes(int N, int A, int B, int testcases) throws Exception
    {
        Scanner scanner=new Scanner(System.in);
        int Result=0;
        try {
            for (int a = 0; a < testcases / 2; a++) {
//            System.out.println(x+" "+y+" "+z);
//            System.out.println("enter the different X  values");
                String S = scanner.next();
                char[] Schar = new char[String.valueOf(N).length()];
                Schar = S.toCharArray();
                int counttimeforinterdistrict = 0;
                int countimeforinterstate = 0;
                for (int tt = 0; tt < N; tt++) {
                    int xr = Integer.parseInt(String.valueOf(Schar[tt]));
                    if (xr == 0) {
                        counttimeforinterdistrict++;
                    } else if (xr == 1) {
                        countimeforinterstate++;
                    }
                }
                Result = A * counttimeforinterdistrict + B * countimeforinterstate;
                return Result;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Result;
    }

}
