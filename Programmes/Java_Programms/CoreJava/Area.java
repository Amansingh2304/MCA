
import java.util.Scanner;

public class Area {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and breath of Rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int ar = l*b;
        System.out.println("Area of rectangle is:"+ ar);
    }
}
