package Main_Package.HackerRank_Solved_Problems;
import java.util.*;

public class Day_4{
    private int age;

    public Day_4(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {

        if ( age >= 0 && age <= 12) {
            System.out.println("You are young.");
        }
        else if (age >= 13 && age <= 17   ) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age += 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day_4 p = new Day_4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}