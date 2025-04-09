package ex_09_While;

import java.util.Random;
import java.util.Scanner;

public class Lab082_guessing_game {
    public static void main(String[] args) {
        Random random  = new Random();
        int numToGuess = random.nextInt(10)+1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome a guessing game, guess a num and win you only have 3 attempts");
        System.out.print("Enter a num : ");

        int guess;
        int attempt = 0;
        while(true){
         guess = sc.nextInt();
         attempt++;

         if(attempt == 10){
             System.out.println("Attempt limit exceed!");
             break;
         }

         if(guess == numToGuess) {
             System.out.println("The num was : "+ numToGuess);
             System.out.println("You Won!!");
             System.out.println("You hav guessed the num in " + attempt+" attempts");
         } else if (guess > numToGuess) {
             System.out.println("too high, try again1");

         } else if (guess < numToGuess) {
             System.out.println("too low, try again!");

         }
        }
    }
}
