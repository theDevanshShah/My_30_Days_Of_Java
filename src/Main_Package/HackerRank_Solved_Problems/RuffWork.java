//DAY 2 Operators
package Main_Package.HackerRank_Solved_Problems;
import java.util.Scanner;

public class RuffWork {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();





        for( int m = 0; m < n ; m++){

            String str = sc.next();
            char[] charArray = str.toCharArray();

            for(int i = 0; i < charArray.length;i+=2){
                System.out.print(charArray[i]);
            }
            System.out.print(" ");
            for(int j = 1; j < charArray.length;j+=2){
                System.out.print(charArray[j]);

            }
            System.out.println("");




        }






    }
}