import java.util.Scanner;

/**
 * There's a zebra crossing appearing in the middle of nowhere with N
 *  blocks in it. The colors of the zebra crossing is represented by a binary string S
 * , where Si
 *  is 1 if the i
 * -th block from the left is white, and 0 if the block is black.
 *
 * Chef really wants to play with the zebra crossing. Although the given zebra crossing might not have alternate black and white blocks, Chef wants to follow the alternating white-black color pattern while crossing it.
 *
 * Initially, Chef stands at block 1
 * . Chef has to jump exactly K
 *  times, and in each jump he has to move forward and jump to a different color than that previously occupied by Chef. More formally, suppose that Chef is currently at block i
 *  and wants to jump to block j
 *  then following conditions should hold:
 *
 * i<j
 * Si≠Sj
 * Output the farthest block Chef can reach with exactly K
 *  jumps. If Chef cannot jump exactly K
 *  times, output -1.
 *
 * Input Format
 * The first line contains an integer T
 *  denoting the number of test cases. The T
 * test cases then follow.
 * The first line of each test case contains two integers N
 *  and K
 * .
 * The second line of each test case consists of a binary string of length N
 * denoting the color of blocks of the zebra crossing.
 * Output Format
 * For each test case, output the farthest block Chef can reach with exactly K
 * jumps, or -1 in case Chef cannot jump exactly K
 *  times.
 *
 * Constraints
 * 1≤T≤105
 * 2≤N≤103
 * 1≤K≤N
 * Sum of N
 *  over all test cases does not exceed 5⋅105
 * Sample Input 1
 *  3
 * 6 2
 * 100101
 * 5 1
 * 10111
 * 6 1
 * 000000
 * Sample Output 1
 *  6
 * 2
 * -1*/



public class Zebracrossingprob19cook {
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



