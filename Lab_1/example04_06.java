import java.util.Scanner;
import java.time.Year;

public class example04_06 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Your name: ");
            String name = console.nextLine();
            System.out.println("Year of birthday: ");
            int year_birthday = console.nextInt();
            int currentYear = Year.now().getValue();
            int age = currentYear - year_birthday;
            if (age > 0){
                System.out.println("You name is " + name + "\nYou are " + age + " years old." );
            } else {
                System.out.println("Incorrect age!");
            }
        }
    }
}
 

