/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_15_bank_charges;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * A bank charges a base fee of $10 per month, plus the following check fees
 * for a commercial checking account:
 * 
 *      $.10 each for less than 20 checks
 *      $.08 each for 20-39 checks
 *      $.06 each for 40-59 checks
 *      $.04 each for 60 or more checks
 * 
 * Write a program that asks for the number of checks written for the month.
 * The program should then calculate and display the bank's service fees for
 * the month.
 */
public class JAVA_PRG_03_15_Bank_Charges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare string to hold user input and final output message
        String strUserInputChecks;
        String strFormattedOutput;
        
        // Declare integer to hold parsed user input
        int intUserInputChecks;
        
        // Declare constants to compare user input against
        final int INT_CHECK_1 = 20;
        final int INT_CHECK_2 = 40;
        final int INT_CHECK_3 = 60;
        
        // Declare float to hold calculated service fee value
        float fltCalculatedFee;
        
        // Declare constant bank checking fees
        final float FLT_FEE_1 = 0.1f;
        final float FLT_FEE_2 = 0.08f;
        final float FLT_FEE_3 = 0.06f;
        final float FLT_FEE_4 = 0.04f;
        
        // Get user input, repeat until positive integer value
        // has been entered
        do
        {
            strUserInputChecks = JOptionPane.showInputDialog("Please enter the "
                    + "number of checks\nyour business used this month.");
            intUserInputChecks = Integer.parseInt(strUserInputChecks);
        } while(intUserInputChecks <= 0);
        
        // Compare validated user input against thresholds for
        // differenct check price fees defined as constants
        // from earlier and mirroring the prompt above
        if(intUserInputChecks < INT_CHECK_1)
        {
            fltCalculatedFee = (float)intUserInputChecks * FLT_FEE_1;
        }
        else if(intUserInputChecks >= INT_CHECK_1 &&
                intUserInputChecks < INT_CHECK_2)
        {
            fltCalculatedFee = (float) intUserInputChecks * FLT_FEE_2;
        }
        else if(intUserInputChecks >= INT_CHECK_2 &&
                intUserInputChecks < INT_CHECK_3)
        {
            fltCalculatedFee = (float) intUserInputChecks * FLT_FEE_3;
        }
        else if(intUserInputChecks >= INT_CHECK_3)
        {
            fltCalculatedFee = (float) intUserInputChecks * FLT_FEE_4;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ERROR CALCULATING CHECK FEE");
            fltCalculatedFee = 0; // To silence runtime error
            System.exit(0);
        }
        
        // Format string for output to user (dollar value) and output
        strFormattedOutput = String.format("For using " + intUserInputChecks +
                " checks this month, your fee is $%.2f", fltCalculatedFee);
        JOptionPane.showMessageDialog(null, strFormattedOutput);
        
        // Terminate for JOptionPane
        System.exit(0);
    }
    
}
