//Ami && INAE! 

import java.lang.Math;
import java.util.Scanner;

public class MathGame{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int player1Lives = 0;
        int player2Lives = 0;

        System.out.println("Hello and Welcom to the two player math game, \nWould you like to play? (y/n): ");
        String firstAnswer = "";
        firstAnswer = input.nextLine();

        if(firstAnswer.equalsIgnoreCase("y")){
            player1Lives = 3;
            System.out.println("You are Player1. You each have 3 lives.");
        } else {
            System.out.println("Bye!");
        }

        System.out.println("Hello and Welcom to the two player math game, \nWould you like to play? (y/n): ");
        String secondAnswer = "";
        secondAnswer = input.nextLine();

        if(secondAnswer.equalsIgnoreCase("y")){
            player2Lives = 3;
            System.out.println("You are Player2. You each have 3 lives.");
        } else {
            System.out.println("Bye!");
        }

        
        // int ranNum1 = (int)(Math.random()*100);
        // int ranNum2 = (int)(Math.random()*100);

        int correct = 0;
        int anwser = 0;


        System.out.println("\nGame Start!\n");

        while(player1Lives > 0 || player2Lives > 0){
                        
            if(player1Lives > 0){
                int ranNum1 = (int)(Math.random()*100);
                int ranNum2 = (int)(Math.random()*100);
                System.out.println("Player1: What is " + ranNum1 + " + " + ranNum2 + "?");
                correct = ranNum1 + ranNum2;
                anwser = input.nextInt();
                if(correct == anwser){
                    System.out.println("Correct! The lives: Player1: " + player1Lives + " Player2: " + player2Lives);
                } else if(correct != anwser){
                    player1Lives = player1Lives - 1;
                    System.out.println("Incorrect! The answer was " + correct + ".\n" + "The lives: Player1: " + player1Lives + " Player2: " + player2Lives);
                }
            }
            if(player2Lives > 0){
                int ranNum1 = (int)(Math.random()*100);
                int ranNum2 = (int)(Math.random()*100);
                System.out.println("Player2: What is " + ranNum1 + " + " + ranNum2 + "?");
                correct = ranNum1 + ranNum2;
                anwser = input.nextInt();
                if(correct == anwser){
                    System.out.println("Correct! The lives: Player1: " + player1Lives + " Player2: " + player2Lives);
                } else if(correct != anwser){
                    player2Lives = player2Lives - 1;
                    System.out.println("Incorrect! The answer was " + correct + ".\n" + "The lives: Player1: " + player1Lives + " Player2: " + player2Lives);
                }
                
            }
            
            
        }   if(player1Lives == 0){
                 System.out.println("The The lives: player 1: " + player1Lives + " player 2: " + player2Lives + " Player2 Wins!");
             } else if(player2Lives == 0){
                 System.out.println("The The lives: player 1: " + player1Lives + " player 2: " + player2Lives + " Player1 Wins!");
            }
             
    
    }
}

