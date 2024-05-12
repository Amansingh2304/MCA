
import java.util.Scanner;

public class UserNatural {
    public static void main(String[] args) {
        System.out.println("Enter the Natural number:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {

            System.out.print(" " + i);

        }
    }

}
