
/*
*Chef opened a company which manufactures cars and bikes. Each car requires 4
tyres while each bike requires 2
tyres. Chef has a total of N
tyres (N
is even). He wants to manufacture maximum number of cars from these tyres and then manufacture bikes from the remaining tyres.

Chef's friend went to Chef to purchase a bike. If Chef's company has manufactured even a single bike then Chef's friend will be able to purchase it.

Determine whether he will be able to purchase the bike or not
* */

import java.util.Scanner;

public class BikeCarProblem19thsep {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {

            int N = sc.nextInt();
            if((N%4)/2!=0) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            test--;
        }
    }


}
