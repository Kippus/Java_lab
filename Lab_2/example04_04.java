import java.util.Scanner;

public class example04_04 {
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            float num = console.nextFloat();
            if (num < 11 & num > 4){
                    System.out.println("Less than or equal to 10 and not less than 5!");
                }else{
                    System.out.println("More than 10 or less than 5!");
            }
        }
    }
}
 

 