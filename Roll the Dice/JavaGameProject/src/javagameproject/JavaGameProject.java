/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameproject;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class JavaGameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //****ROLL THE DICE(SINGLE PLAYER GAME)****

        //Content for creating variables 
        int totalRounds = 10;
        int Htut_dieScore;
        int Zwe_dieScore;
        int Htut_marks = 0;
        int Zwe_marks = 0;


        //Content for main codes 
        Random random = new Random();
        for (int t = 1; t <= totalRounds; t++) {
            Htut_dieScore = random.nextInt(6) + 1;
            Zwe_dieScore = random.nextInt(6) + 1;
            if (Htut_dieScore > Zwe_dieScore) {
                Htut_marks++;
                System.out.println("Ko Htut wins round " + t + " So, he wins 1 mark");
                System.out.println("Ko Htut's score :" + Htut_dieScore);
                System.out.println("Ko Zwe's score :" + Zwe_dieScore);
            } else if (Htut_dieScore < Zwe_dieScore) {
                Zwe_marks++;
                System.out.println("Ko Zwe wins round " + t + " So,he wins 1 mark");
                System.out.println("Ko Htut's score :" + Htut_dieScore);
                System.out.println("Ko Zwe's score :" + Zwe_dieScore);
            } else {
                Htut_marks += 0;
                Zwe_marks = +0;
                System.out.println("Tie. No one wins a mark");
                System.out.println("Ko Htut's score :" + Htut_dieScore);
                System.out.println("Ko Zwe's score :" + Zwe_dieScore);
            }
        }
        if (Htut_marks > Zwe_marks) {
            System.out.println("Ko Htut is the grand winner");
            System.out.println("Ko Htut's total mark :" + Htut_marks);
            System.out.println("Ko Zwe's total mark : " + Zwe_marks);
        } else if (Htut_marks < Zwe_marks) {
            System.out.println("Ko Zwe is the grand winner");
            System.out.println("Ko Zwe's total mark :" + Htut_marks);
            System.out.println("Ko Htut's total mark : " + Zwe_marks);
        } else {
            System.out.println("Tie.Both of the players gained the same marks");
            System.out.println("Ko Htut's total mark :" + Htut_marks);
            System.out.println("Ko Zwe's total mark : " + Zwe_marks);
        }

    }
}
