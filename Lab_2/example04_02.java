import java.util.Scanner;

public class example04_02 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            float num = console.nextFloat();
            if (num % 5 == 2){
                if(num % 7 == 1){
                    System.out.println("Result " + num / 5 + ' ' + num / 7);
                }
            }else{
                System.out.println("Incorrect remainder");
            }
        }
    }
}
 

