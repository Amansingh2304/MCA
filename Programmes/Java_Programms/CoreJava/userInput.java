
import java.util.Scanner;

class Userinput {

    
    public static void main(String[] args) {
        System.out.println("Enter the Two NUmber for adding");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of " + a + " and " + b + " is Equal to: " + (a + b));
        }
    }
}
