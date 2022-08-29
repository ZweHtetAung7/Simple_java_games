/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javagameproject2;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class JavaGameProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Slot Machine 
        Random random = new Random();
        int totalTimes = 4;
        int Ko_Htut_score = 0;
        int Ko_Zwe_score = 0;

        //For ko htut
        int slot1 = random.nextInt(2);
        int slot2 = random.nextInt(2);
        int slot3 = random.nextInt(2);
        //For ko zwe
        int slot4 = random.nextInt(2);
        int slot5 = random.nextInt(2);
        int slot6 = random.nextInt(2);

        for (int times = 1; times < totalTimes; times++) {

            System.out.println("Round " + times);
            if (slot1 == slot2 && slot1 == slot3) {
                System.out.println("Congratulations,Ko Htut..Jackpot");
                System.out.println("Slot 1:" + slot1);
                System.out.println("Slot 1:" + slot1);
                System.out.println("Slot 3: " + slot3);
                Ko_Htut_score = Ko_Htut_score + 1;
                System.out.println("Ko Htut wins one point");
            } else {
                System.out.println("Opps..unlucky,Ko Htut. Better luck next time");
                System.out.println("Slot 1:" + slot1);
                System.out.println("Slot 1:" + slot1);
                System.out.println("Slot 3: " + slot3);
            }
            if (slot4 == slot5 && slot4 == slot6) {
                System.out.println("Congratulations,Ko Zwe...Jackpot");
                System.out.println("Slot 1:" + slot4);
                System.out.println("Slot 2:" + slot5);
                System.out.println("Slot 3:" + slot6);
                Ko_Zwe_score = Ko_Zwe_score + 1;
                System.out.println("Ko Zwe wins one point");
            } else {
                System.out.println("Oops..unlucky,Ko Zwe. Better luck next time");
                System.out.println("Slot 1:" + slot4);
                System.out.println("Slot 2:" + slot5);
                System.out.println("Slot 3:" + slot6);
            }

        }
        if (Ko_Zwe_score > Ko_Htut_score) {
            System.out.println("Ko Zwe is the grand winner,winning " + Ko_Zwe_score + " rounds");
            System.out.println("Ko Zwe's total points:" + Ko_Zwe_score);
            System.out.println("Ko Htut's total points:" + Ko_Htut_score);
        } else if (Ko_Zwe_score < Ko_Htut_score) {
            System.out.println("Ko Htut is the grand winner,winning " + Ko_Htut_score + " rounds");
            System.out.println("Ko Htut's total points:" + Ko_Htut_score);
            System.out.println("Ko Zwe's total points:" + Ko_Zwe_score);
        } else {
            System.out.println("Tie..No one wins");
            System.out.println("Ko Htut's total points:" + Ko_Htut_score);
            System.out.println("Ko Zwe's total points:" + Ko_Zwe_score);

        }
    }
}
