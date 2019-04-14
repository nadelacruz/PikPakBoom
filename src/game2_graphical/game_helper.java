/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2_graphical;
import java.io.*;
import java.util.*;
/**
 *
 * @author Asus
 */
public class game_helper implements Serializable  {
    int comp_guess, user_guess, no_of_rounds;
    move comp, user;
    
    
    void startgame(){
        game_helper game = new game_helper();
        
        System.out.println("Welcome to the rock paper scissors game, here are the instructions:");
        game.rounds();
        
    }

    void rounds(){
        Random rand = new Random();
        game_helper game = new game_helper();
        move ppb = new move();
        int rounds, user_scr = 0, comp_scr = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many rounds do you want to play? ");
        rounds = in.nextInt();
        
        for (int i = 0; i < rounds; i++){
            game.user_guess = 0;
            game.comp_guess = rand.nextInt(3)+1;
            game.assigncom();
            game.guess();
            game.assignuser();
        
            System.out.println("");
        
            System.out.println("User picked: " + game.user.name);
            System.out.println("Computer picked: " + game.comp.name);
            System.out.println("");
        
            ppb.fight(game.user, game.comp);
            System.out.println("");
            
           
            
            if (ppb.winner == 1){
                user_scr++;
            } if (ppb.winner == 2){
                comp_scr++;
            }  
            
            System.out.println("Your total score: " + user_scr);
            System.out.println("Computer's total score: " + comp_scr);
        
            System.out.println("");
            
            if (i == rounds-1){
                if (user_scr == comp_scr){
                    System.out.println("No one wins, it's a tie!");
                    System.out.println("You and Computer both scored: " + user_scr);
                } else {
                    if (user_scr > comp_scr){
                        System.out.println("You win, congratulations!");
                        System.out.println("Your total score: " + user_scr);
                        System.out.println("Computer's total score: " + comp_scr);
                    } else {
                        System.out.println("You lost, better luck next time!");
                        System.out.println("Your total score: " + user_scr);
                        System.out.println("Computer's total score: " + comp_scr);
                    }
                }
            }  
        }
        
        
       
    }
    
    void guess(){
        Scanner in = new Scanner(System.in);
        while (user_guess < 1 || user_guess > 3){
            System.out.println("Rock = 1, Paper = 2, Scissors = 3");
            System.out.print("Your guess: ");
            user_guess = in.nextInt();
        }
    }
    
    void assigncom(){
        switch (comp_guess) {
            case 1:
                move rock = new rock();
                comp = rock;
                break;
            case 2:
                move paper = new paper();
                comp = paper;
                break;
            case 3:
                move scissors = new scissors();
                comp = scissors;
                break;
            default:
                break;
        }
    }
    
    void assignuser(){
        switch (user_guess) {
            case 1:
                move rock = new rock();
                user = rock;
                break;
            case 2:
                move paper = new paper();
                user = paper;
                break;
            case 3:
                move scissors = new scissors();
                user = scissors;
                break;
            default:
                break;
          
        }
    }
    
}
