import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number that u want to create multiplication table: ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <= 50; i++) {
            System.out.println(x+" "+"*"+" "+i+" " +" "+"="+" "+x*i);
        }
    }
}
