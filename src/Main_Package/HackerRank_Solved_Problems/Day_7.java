//DAY 7 Playing with Arrays in JAVA

package Main_Package.HackerRank_Solved_Problems;
import java.util.Scanner;
public class Day_7 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array[] = new int[size];

        //Input
        for(int i =0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //Output
        for(int j = array.length - 1; j >= 0 ; j--){
            System.out.print(array[j] + " ");
        }
    }
}
