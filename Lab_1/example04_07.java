import java.util.Scanner;
import java.time.Year;

public class example04_07 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Your age: ");
            int age = console.nextInt();
            int currentYear = Year.now().getValue();
            int year_birthday = currentYear - age;
            if (year_birthday > 0){
                System.out.println("You were born in " + year_birthday );
            } else {
                System.out.println("Incorrect age!");
            }
        }
    }
}
 

