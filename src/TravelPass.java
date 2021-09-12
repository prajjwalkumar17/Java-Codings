import java.io.IOException;
import java.util.Scanner;

public class TravelPass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String str = sc.next();
            int count_zero = 0;
            int count_one = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    count_zero++;
                } else {
                    count_one++;
                }
            }
            int time = (count_zero * a) + (count_one * b);
            System.out.println(time);
            test--;

        }
    }
}
  /*      Scanner scanner=new Scanner(System.in);
        int testcases = scanner.nextInt();
        int[] result = new int[testcases];
        if (testcases == 1) {
            try {

                int x = scanner.nextInt();

                int y = scanner.nextInt();

                int z = scanner.nextInt();
                String pq = scanner.next();
                char[] pqchar = new char[String.valueOf(x).length()];
                pqchar = pq.toCharArray();
                int countx = 0;
                int county = 0;
                for (int tt = 0; tt < x; tt++) {
                    int xr = Integer.parseInt(String.valueOf(pqchar[tt]));
                    if (xr == 0) {
                        countx++;
                    } else if (xr == 1) {
                        county++;
                    }
                }
                System.out.println(y * countx + z * county);
            }catch(Exception e){
                e.printStackTrace();

            }
        }

        else {
            for (int a = 0; a < testcases; a++) {
                int x = scanner.nextInt();

                int y = scanner.nextInt();

                int z = scanner.nextInt();

                result[a] = printyes(x, y, z, testcases);
            }
            for (int ui = 0; ui < testcases; ui++) {
                System.out.println(result[ui]);

            }
        }*/


/*
    private static int printyes(int x, int y, int z, int testcases) {
        Scanner scanner=new Scanner(System.in);
        int yuyu=0;
        try {
            for (int a = 0; a < testcases / 2; a++) {
//            System.out.println(x+" "+y+" "+z);
//            System.out.println("enter the different X  values");
                String pq = scanner.next();
                char[] pqchar = new char[String.valueOf(x).length()];
                pqchar = pq.toCharArray();
                int countx = 0;
                int county = 0;
                for (int tt = 0; tt < x; tt++) {
                    int xr = Integer.parseInt(String.valueOf(pqchar[tt]));
                    if (xr == 0) {
                        countx++;
                    } else if (xr == 1) {
                        county++;
                    }
                }


//            System.out.println(y*countx +z*county);

                yuyu = y * countx + z * county;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return yuyu;
    }
*/


