import java.util.Scanner;

public class example04_03 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            float num = console.nextFloat();
            if (num > 10){
                if(num % 4 == 0){
                    System.out.println("Result " + num / 4 );
                }else{
                    System.out.println("The number is not divisible by 4");
                }
            }else{
                System.out.println("Number less than 10");
            }
        }
    }
}
 

