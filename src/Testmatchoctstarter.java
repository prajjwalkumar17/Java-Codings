import java.util.Scanner;

public class Testmatchoctstarter {
    /**
     * A 5 match test series between India and England has just concluded.
     *
     * Every match could have ended either as a win for India, a win for England, or a draw. You know the result of all the matches. Determine who won the series or if it ended in a draw.
     *
     * A team is said to have won the series if it wins strictly more test matches than the other team.
     * Ri=0  denotes that the test match ends in a draw.
     * Ri=1 denotes that the test match is won by India.
     * Ri=2 denotes that the test match is won by England.*/
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test --> 0) {
            int INDwin=0;
            int ENGwin=0;
            int[] A=new int[5];
            A[0] = sc.nextInt();
            A[1] = sc.nextInt();
            A[2]= sc.nextInt();
            A[3]= sc.nextInt();
            A[4]= sc.nextInt();

            for(int i=0;i<5;i++){
                if(A[i]==1){
                    INDwin++;
                } else if(A[i]==2){
                    ENGwin++;
                }
            }
            if(INDwin>ENGwin){
                System.out.println("INDIA");
            } else if (ENGwin>INDwin){
                System.out.println("ENGLAND");
            } else {
                System.out.println("DRAW");
            }

        }
    }
}
