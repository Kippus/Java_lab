import java.util.Scanner;

public class example04_04 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("One month (Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec): ");
            String month = console.nextLine();
            System.out.println("Days in a month: ");
            int day_month = console.nextInt();
            if ( month.equals("Jan") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
                if ( day_month == 31 ){
                    System.out.println("Correctly 31 days!");
                } else{
                    System.out.println("Not 31 days!");
                }
            } else if ( month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov") ){
                if ( day_month == 30 ){
                    System.out.println("Correctly 30 days!");
                } else {
                    System.out.println("Not 30 days!");
                }
            } else if ( month.equals("Feb")){
                if (day_month == 28 | day_month == 29){
                    System.out.println("Correctly 28 or 29 days!");
                } else {
                    System.out.println("Not 28 or 29 days!");
                }
            } else {
                System.out.println("Incorrect data!");
            }
        }
    }
}