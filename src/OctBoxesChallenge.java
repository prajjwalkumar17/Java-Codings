import java.util.Scanner;
/*
*Chef has 3
 boxes of sizes A
, B
, and C
 respectively. He puts the boxes in bags of size D
 (A≤B≤C≤D
). Find the minimum number of bags Chef needs so that he can put each box in a bag. A bag can contain more than one box if the sum of sizes of boxes in the bag does not exceed the size of the bag.
* */

public class OctBoxesChallenge {
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
