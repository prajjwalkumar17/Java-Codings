
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {

            int noofblocks = sc.nextInt();
            int noofjumps = sc.nextInt();
            String S = sc.next();
            char[] blocks = S.toCharArray();

                alternateblockcounter(blocks, noofblocks, noofjumps);


            test--;
        }
    }

    private static void alternateblockcounter(char[] blocks, int noofblocks, int noofjumps) {
        if (noofjumps > 0 && blocks[noofblocks - 1] != blocks[0]) {
            System.out.println(noofblocks);
        } else {
            int intjump = noofjumps;
            int result = 0;
            while (noofjumps != 0) {
                int p = 0;
                for (int i = 1; i < noofblocks; i++) {
                    if (blocks[i] != blocks[p]) {
                        p = i;
                    }
                }
                result = p + 1;
                noofjumps--;
            }
            if (result == 1 || result == 0) {
                System.out.println(-1);
            } else {
                if (intjump == 1) {
                    System.out.println(result - 1);
                } else {
                    System.out.println(result);
                }
            }
        }
    }


}



