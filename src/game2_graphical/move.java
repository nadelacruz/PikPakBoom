/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2_graphical;
import java.io.*;


/**
 *
 * @author Asus
 */
public class move implements Serializable {
   int value, winner;
   String name, win_draw_lose, winlose;
   void fight(move a, move b){
       if (a.value == b.value){
           winner = 0;
           win_draw_lose = "Ties vs.";
           winlose = "Draw!";
       } else {
           if ((b.value == 2 && a.value == 1) || (b.value == 1 && a.value == 3) || (b.value == 3 && a.value == 2)){
               winner = 2;
               win_draw_lose = "Loses vs.";
               winlose = "You lose!";
           } else if((a.value == 2 && b.value == 1) || (a.value == 1 && b.value == 3) || (a.value == 3 && b.value == 2)){
               winner = 1;
               win_draw_lose = "Wins vs.";
               winlose = "You win!";
           } 
       }
       
   }
   
}
