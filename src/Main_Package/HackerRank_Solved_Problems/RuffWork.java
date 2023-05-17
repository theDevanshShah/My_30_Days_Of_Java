//DAY 2 Operators
package Main_Package.HackerRank_Solved_Problems;
import java.util.Scanner;

public class RuffWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 != 0) {
        System.out.println("Weird");
        }
        else if (a == 2 && a == 4){
            System.out.println("Not Weird");
        }
        else if (a == 6 && a == 8 && a == 10 && a == 12 && a == 14 && a == 16 && a == 18){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
}


        //If  n is odd, print Weird --
        //If  n is even and in the inclusive range of  2 to 5 , print Not Weird
        //If  n is even and in the inclusive range of 6 to 20 , print Weird
        //If  n is even and greater than 20 , print Not Weird