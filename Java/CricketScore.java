import java.util.Scanner;

public class CricketScore {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int totalruns = 0, totalballs = 0, run;
        do {
            System.out.print("Enter run: ");
            run = sc.nextInt();
            if (run == -1) {
                System.out.println("Playes is out");
            } else {
                totalruns += run;
                totalballs++;
            }
        } while (run != -1);
        System.out.println("Total Runs Scored " + totalruns);
        System.out.println("Total Balls Played " + totalballs);
    }
}
