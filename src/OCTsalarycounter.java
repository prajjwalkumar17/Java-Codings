import java.util.Scanner;

public class OCTsalarycounter { /**
 * Given the schedule of Chef for 30 days (A binary string of length 30 where '0' denotes that Chef was on leave and '1'
 * denotes Chef was working on that day). Chef gets X− Rs for every day he worked. As working continuously for a long time
 * s hectic so Company introduced the following policy to give a bonus to its employees.
 * <p>
 * The company will check the longest streak for which an employee has worked and will award Y− Rs for every day of that
 * streak as a bonus. Calculate the salary received by Chef (including the bonus).
 */
public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while (test-- > 0) {
        int dayscounted = 0;
        int everydaypay = sc.nextInt();
        int Streakpay = sc.nextInt();
        String daysworked = sc.next();


        char[] days = daysworked.toCharArray();

        for (int i = 0; i < daysworked.length(); i++) {
            if (Character.getNumericValue(days[i])==1){
                dayscounted++;
            }
        }

        System.out.println((dayscounted*everydaypay)+(Streakpay*getMaxLength(days,days.length)));

    }
}

    static int getMaxLength(char[] arr, int n)
    {

        int count = 0; //intitialize count
        int result = 0; //initialize max

        for (int i = 0; i < n; i++)
        {
            // Reset count when 0 is found
            if (Character.getNumericValue(arr[i]) == 0)
                count = 0;
                // If 1 is found, increment count
                // and update result if count becomes
                // more.
            else
            {
                count++;//increase count
                result = Math.max(result, count);
            }
        }

        return result;
    }
}