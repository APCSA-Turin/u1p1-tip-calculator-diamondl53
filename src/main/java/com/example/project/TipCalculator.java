package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double totalBill = cost;
        double totalTip = totalBill*(percent/100.0);
        double billwithTip = totalBill+totalTip;
        double personCost = totalBill/people;
        double personTip = totalTip/people;
        double personcostwithTip = personCost+personTip;
        String pattern = "##.##";
        //Here is where I researched rounding: https://jenkov.com/tutorials/java-internationalization/decimalformat.html//
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+ decimalFormat.format(totalBill) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "  + decimalFormat.format(percent) + "%\n");
        result.append("Total tip: $" + decimalFormat.format(totalTip) + "\n");
        result.append("Total Bill with tip: $" + decimalFormat.format(billwithTip) + "\n");
        result.append("Per person cost before tip: $" + decimalFormat.format(personCost) + "\n");
        result.append("Tip per person: $" +decimalFormat.format(personTip) + "\n");
        result.append("Total cost per person: $" + decimalFormat.format(personcostwithTip) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
