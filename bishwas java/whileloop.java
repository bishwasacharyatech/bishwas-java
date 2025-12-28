import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int i, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that u want to create multiplication table: ");

        int x = sc.nextInt();
        System.out.println("Multiplication table of " + x + " is: ");
        i = 1;
        while (i <= 10) {
            result = x * i;
            System.out.println(x + " * " + i + " = " + result);
            i++;
        }
    }
}
