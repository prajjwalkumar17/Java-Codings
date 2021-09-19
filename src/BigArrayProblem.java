import java.util.Scanner;

public class BigArrayProblem{
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {

            int Max = sc.nextInt();
            int Sum = sc.nextInt();

            int[] A = new int[Max + 1];
            for (int i = 1; i <= Max; i++) {
                A[i] = i;
            }
            loopy(A,Max,Sum);
            test--;
        }
    }

    private static void loopy(int[] A,  int Max, int Sum) {
        for (int i = 0; i <= Max; i++) {
            for (int j = i + 2; j <= Max+1; j++) {
                int resulty = sumum(A, 1, i) + sumum(A, j, Max);
                if (resulty==Sum) {
                    System.out.println(i+1);
                    return;
                }
                break;
            }

        }
        System.out.println(-1);

    }
    private static int sumum(int[] A, int indexfrom, int indexto) {
        int summmmy = 0;
        for (int i = indexfrom; i <= indexto; i++) {
            summmmy = summmmy + A[i];
        }
        return summmmy;
    }

}