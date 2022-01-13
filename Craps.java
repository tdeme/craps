import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            play();
            playAgain = playAgain();
        }
    }

    public static void play(){
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        int sum = die1.roll() + die2.roll();
        System.out.println("You rolled " + sum);
        if (sum == 7 || sum == 11) {
            System.out.println("You win!");
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose!");
        } else {
            int point = sum;
            boolean win = false;
            while (!win) {
                sum = die1.roll() + die2.roll();
                System.out.println("You rolled " + sum);
                if (sum == point) {
                    win = true;
                    System.out.println("You win!");
                } else if (sum == 7) {
                    System.out.println("You lose!");
                    win = true;
                }
            }
        }   
    }

    public static boolean playAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Play again? (y/n): ");
        String answer = input.next();
        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        } 
    }
}
