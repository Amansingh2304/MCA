import java.util.Scanner;

public class Overloading {

    public Overloading() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);

    }

    public Overloading(int a, int b) {

        int product = a * b;
        System.out.println("Product: " + product);
    }

    public static void main(String[] args) {
        Overloading c = new Overloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Overloading c1 = new Overloading(num1, num2);
        sc.close();

    }

}
