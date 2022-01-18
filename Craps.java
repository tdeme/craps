import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        System.out.println("Let's play Craps!");
        System.out.println("Do you need instructions? (y/n)");
        Scanner input1 = new Scanner(System.in);
        String answer1 = input1.nextLine();
        if(answer1.toLowerCase().equals("y")){
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
        }
        System.out.println();
        System.out.println("Good luck!");
        System.out.println();
        boolean playAgain = true;
        while (playAgain) {
            play();
            playAgain = playAgain();
        }
    }

    public static void play(){
        Scanner wait = new Scanner(System.in);
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        System.out.print("Press <enter> to roll the dice...");
        String nothing = wait.nextLine();
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
                System.out.print("Press <enter> to roll the dice...");
                nothing = wait.nextLine();
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
        String answer = input.nextLine();
        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        } 
    }
}
