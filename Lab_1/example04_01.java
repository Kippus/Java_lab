import java.util.Scanner;

class Example04_01{
    public static void main (String [] args){
        try (Scanner console = new Scanner(System.in)) {
            String name = console.nextLine();
            System.out.print(name);
        }
    }
}