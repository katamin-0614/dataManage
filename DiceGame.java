import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling the dice...");
        Random rand = new Random();
        int dice1 = rand.nextInt(5) + 1;
        int dice2 = rand.nextInt(5) + 1;

        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + (dice1 + dice2));

    }
}