import java.util.Scanner;

public class example04_02 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Your name: ");
            String name = console.nextLine();
            System.out.println("Your age: ");
            int age = console.nextInt();
            System.out.print("Your name: " + name + "\nYour age: " + age);
        }
    }
}