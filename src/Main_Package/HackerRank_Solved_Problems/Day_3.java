package Main_Package.HackerRank_Solved_Problems;
import java.util.Scanner;
public class Day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}

//If  n is odd, print Weird --
//If  n is even and in the inclusive range of  2 to 5 , print Not Weird
//If  n is even and in the inclusive range of 6 to 20 , print Weird
//If  n is even and greater than 20 , print Not Weird





/*
* Objective
In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0:
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1:
 and  is even, so it is not weird. Thus, we print Not Weird.*/