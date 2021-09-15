import java.util.Scanner;

public class ArrayMatrixProblemTLE {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {
            int N = sc.nextInt();
            int[][] A = new int[N][N];
            if (N % 2 == 0) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        A[i][j] = -1;
                    }
                }
            } else {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i % 2 != 0 || j % 2 != 0) {
                            A[i][j] = 1;
                        } else {
                            A[i][j] = -1;
                        }
                    }
                }


            }
            for (int y = 0; y < N; y++) {
                for (int z = 0; z < N; z++) {
                    System.out.print(A[y][z]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            test--;
        }


    }


}
