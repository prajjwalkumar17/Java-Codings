import java.util.Scanner;

public class DirectionProblem {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0){
            int turns=sc.nextInt();

            int direction=turns%4;

            if(direction==1){
                System.out.println("East");

            } else if(direction==2){
                System.out.println("South");
            } else if(direction==3){
                System.out.println("West");
            } else if(direction==0){
                System.out.println("North");
            }



            test--;
        }
    }
}
