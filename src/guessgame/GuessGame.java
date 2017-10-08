/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author obyobuora
 */
public class GuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r ;
        int i ;
        int score = 0;
        
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        r = random.nextInt(100);
        System.out.println("Guess a number between 0-99 ");
        
        while  ((i = sc.nextInt())!= r){
        
            if (i<r){
            
                System.out.println("try a bigger number :");
                score ++;
            } else if (i>r){
                System.out.println("try a smaller number :");
                score ++;
            }
        }
        
        System.out.println("the result : "+r);
        System.out.println("score : " + score);
        
    }
    
}
