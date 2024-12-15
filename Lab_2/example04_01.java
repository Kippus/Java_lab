import java.util.Scanner;

public class example04_01 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            float num = console.nextFloat();
            if (num % 3 == 0){
                System.out.println("Result " + num / 3);
            }else{
                System.out.println("There remains a remainder");
            }
        }
    }
}
 

