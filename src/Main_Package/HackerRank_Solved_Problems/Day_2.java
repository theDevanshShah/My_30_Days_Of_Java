//DAY 2 Operators
package Main_Package.HackerRank_Solved_Problems;
import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double mainPrice = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();
        double actualTip = (mainPrice * tipPercent) / 100 ;
        System.out.println(actualTip);
        double actualTax = (mainPrice * taxPercent)/ 100;
        System.out.println(actualTax);
        double total = mainPrice + actualTip + actualTax + 0.50;
        System.out.println((int)total);

    }
}


/* This is the perfect way to write this code
Here, Google Bard used Math.round() method to print amount as nearest integer

import java.util.*;

public class RuffWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mainPrice = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();

        double tip = mainPrice * tipPercent / 100;
        double tax = mainPrice * taxPercent / 100;

        double total = mainPrice + tip + tax;
        int roundedTotal = (int) Math.round(total);

        System.out.println(roundedTotal);
    }
}
*/




/* DAY 2
Objective
In this challenge, you will work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

Example



A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.

Function Description
Complete the solve function in the editor below.

solve has the following parameters:

int meal_cost: the cost of food before tip and tax
int tip_percent: the tip percentage
int tax_percent: the tax percentage
Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.

Input Format

There are  lines of numeric input:
The first line has a double,  (the cost of the meal before tax and tip).
The second line has an integer,  (the percentage of  being added as tip).
The third line has an integer,  (the percentage of  being added as tax).

Sample Input

12.00
20
8
Sample Output

15
Explanation

Given:
, ,

Calculations:




We round  to the nearest integer and print the result, .*/
