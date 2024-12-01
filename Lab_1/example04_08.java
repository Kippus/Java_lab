import java.util.Scanner;

public class example04_08 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            int a = console.nextInt();
            System.out.println("Enter b: ");
            int b = console.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}
 

