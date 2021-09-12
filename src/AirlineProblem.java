import java.util.Scanner;

 class AirlineProblem {
     public static void main(String[] args) {

        //TODO change scanner
         Scanner scanner = new Scanner(System.in);
        int nooftestcases = scanner.nextInt();
        String[] distinctstringarray = new String[nooftestcases + 1];
        for (int i = 0; i < nooftestcases + 1; i++) {
            distinctstringarray[i] = scanner.nextLine();
        }
        for (int j = 0; j < nooftestcases; j++) {
            String hbhb = distinctstringarray[j + 1];

            fun(hbhb);
        }
    }


    private static void fun(String abcd) {
        try{
            String[] token = abcd.split(" ");
            int[] inputnos = new int[5];
            for (int i = 0; i < 5; i++) {
                inputnos[i] = Integer.parseInt(token[i]);
            }
            int a = inputnos[0];
            int b = inputnos[1];
            int c = inputnos[2];
            int d = inputnos[3];
            int e = inputnos[4];

            int miofthethreeweights = minimumofthree(a, b, c);
            int sumofcheckedinbag = maxofallthree(a, b, c);
            if (sumofcheckedinbag <= d && miofthethreeweights <= e) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (NumberFormatException exception){
            exception.printStackTrace();
        }
    }
    private static int maxofallthree(int a, int b, int c) {
        int maxu = Math.max(a, b);
        int lastmaxu = Math.max(maxu, c);
        return maxu + lastmaxu;
    }
    private static int minimumofthree(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

}
