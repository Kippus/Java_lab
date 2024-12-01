import java.util.Scanner;

public class example04_09 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            int a = console.nextInt();
            int b = a - 1;
            int c = a + 1;
            int x = a + b + c;
            double pow_a = x * x; 
            System.out.println(b + " " + a + " " + c + " " + pow_a);
        }
    }
}