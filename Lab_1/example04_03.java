import java.util.Scanner;

public class example04_03 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Day of the week: ");
            String day_week = console.nextLine();
            System.out.println("Month: ");
            String month = console.nextLine();
            System.out.println("Day of the month: ");
            int day_month = console.nextInt();
            System.out.print("To day: " + day_week + "-" + day_month + "-" + month);
        }
    }
}