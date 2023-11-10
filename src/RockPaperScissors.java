/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author France Leoncio
 */

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");
        Move pChoice = null;
        Move cChoice = null;
        int cMove = (int) Math.floor(Math.random()*3) + 1;
        
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
        
        int restart = 1;
        int roundsToWin = 2;
        
        
            while (restart == 1) {
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:\n" + "1. Start game\n" + "2. Change number of rounds\n" + "3. Exit application\n");
                System.out.print("> ");
                int welcomeResponse = sc.nextInt();
                System.out.print("\n\n");
                
                switch (welcomeResponse) {
                    case 1: // welcomeResponse == 1
                    int pScore = 0;
                    int cScore = 0;
                    System.out.println("This match will be first to " + roundsToWin + " wins." + "\n");
                    
                        while (pScore < roundsToWin && cScore < roundsToWin) {
                            System.out.println("The computer has selected its move. Select your move:\n" + 
                                    "1. Rock \n" + "2. Paper \n" + "3. Scissors\n" + "> ");
                            int pMove = sc.nextInt();
                            System.out.println("\n\n");
                            
                            switch(pMove) {
                                case 1: // pChoice = rock;
                                    pChoice = rock;
                                    break;
                                case 2: // pChoice = paper;
                                    pChoice = paper;
                                    break;
                                case 3: // pChoice = scissors;
                                    pChoice = scissors;
                                    break;
                                default:
                                    System.out.println("invalid");
                            }
                            
                            switch(cMove) {
                                case 1: // cChoice = rock;
                                    cChoice = rock;
                                    break;
                                case 2: // cChoice = paper;
                                    cChoice = paper;
                                    break;
                                case 3: // cChoice = scissors;
                                    cChoice = scissors;
                                    break;
                                default:
                                    System.out.println("invalid");
                            }
                            
                            int winner = Move.compareMoves(pChoice, cChoice);
                            System.out.println("Player chose " + pChoice.getName() + ". Computer chose " + cChoice.getName() + ".");
                            
                            switch(winner) {
                                case 0: // .compareMoves returns 0 when m1.getStrongAgainst() == m2; therefore when player wins
                                    System.out.println("Player wins round! \n");
                                    pScore++;
                                    break;
                                case 1: // when computer wins
                                    System.out.println("Computer wins round! \n");
                                    cScore++;
                                    break;
                                case 2: //neither wins
                                    System.out.println("Round is tied! \n");
                                    break;
                                default:
                                    System.out.println("Invalid \n");
                            }
                            System.out.println("Player: " + pScore + " - Computer: " + cScore + "\n\n");
                        }
                        
                        break;
                        
                        
                    case 2: // welcomeResponse == 2
                        System.out.println("How many wins are needed to win a match? \n" + "> ");
                        roundsToWin = sc.nextInt();
                        System.out.println("\n\n");
                        System.out.println("New setting has been saved!" + "\n\n");
                        
                    case 3: // welcomeResponse == 3
                        restart = 0;
                        System.out.println("Thank you for playing!");
                    
                    default:
                        System.out.println("Invalid");
                }
            }
            
         
    }
}
