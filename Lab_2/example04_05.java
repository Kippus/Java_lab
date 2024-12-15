import java.util.Scanner;

public class example04_05 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            int num = console.nextInt();
            num = num / 1000;
            System.out.println(num);
        }
    }
}
 

 