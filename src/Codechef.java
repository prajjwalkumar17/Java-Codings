
import java.util.*;
import java.lang.*;

class Codechef {
    /**
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
            int Time = sc.nextInt();
            if(Time%2==0){
                System.out.println(((Time/2)*3)-(Time/2));
            } else{
                System.out.println(((Time/2)*3)-(Time/2)+3);

            }

        }
    }
}