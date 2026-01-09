
import java.util.Random;
import java.util.Scanner;

class GuesstheNumber {

    static public void main(String args[]) {
        Random r = new Random();
        Scanner ob = new Scanner(System.in);
        int number = r.nextInt(100), score = 100, guess,count=0;
        while (true) {
            System.out.print("Enter the number : ");
            guess = ob.nextInt();
            count++;
            if (guess > 0 && guess <= 100) {
                if (guess == number) {
                    System.out.println("Congratulations! You guessed it! in the " +count+" times "+", Thanks for playing!");
                    System.out.println("The Score is " + score);
                    break;
                } else if (guess > number) {
                    System.out.println("Go Low");
                    score -= 5;
                } else {
                    System.out.println("Go High");
                    score -= 5;
                }
            } else {
                System.out.println("Enter the number between 1 to 100");
            }

        }
    }
}
