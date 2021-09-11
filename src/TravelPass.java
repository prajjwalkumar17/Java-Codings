import java.io.IOException;
import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) throws IOException
    {
        int N=0,A=0,B=0;


        try{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of test cases");
        int nooftestcases=scanner.nextInt();
            String[] output=new String[nooftestcases];
        for(int j=0;j<nooftestcases;j++) {
            // Display message for better readibility
            System.out.println("enter input ");
            Scanner sc = new Scanner(System.in);

            // Declaring and initializing an array of size 10
            int[] nums = new int[3];
            int i;

            // Loop to store input values in nums array
            for (i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            //  Display message
            //  System.out.println("printing stored values");
            //  Printing stored values

            for (i = 0; i < nums.length; i++) {
                N=nums[0];
                A=nums[1];
                B=nums[2];
            }
            output=showtheinput(N,A,B,nooftestcases);
        }
        showout(output);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    private static String[] showtheinput(int n, int a, int b,int length) {
        String[] output=new String[length];

        System.out.println(n+" "+a+" "+b+" ");

        showout(output);
        return output;
    }

    private static void showout(String[] output) {

        for(int y=0;y< output.length;y++){
            System.out.println(output[y]);
        }
    }
}
