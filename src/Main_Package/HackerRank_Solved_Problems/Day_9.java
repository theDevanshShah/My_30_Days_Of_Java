package Main_Package.HackerRank_Solved_Problems;
import java.util.Scanner;
class Result {
    public static int factorial(int n) {
        // Write your code here
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}

 public class Day_9{
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Result.factorial(n);
        System.out.println(result);
    }
}
