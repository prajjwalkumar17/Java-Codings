import java.util.Scanner;

public class octstarter {/**
 *
 * The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer.
 * Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got X questions correct
 * and the rest of them incorrect. For Chef to pass the course he must score at least P marks.
 *
 * Will Chef be able to pass the exam or not?*/
public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while (test-- > 0) {
        int Total= sc.nextInt();
        int Correct = sc.nextInt();
        int TO_pass = sc.nextInt();

//            int total_marks_obtained=(3*Correct)+(-1*(Total-Correct))

        if((3*Correct)+(-1*(Total-Correct))>=TO_pass){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }



    }
}
}