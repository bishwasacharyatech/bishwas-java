/*Write a java program to print odd and even number using ternery opertor ((bool exp)?true:false)*/
import java.util.Scanner;

public class ter {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int num = sc.nextInt();// inpiut int if sc.nextLine
        // logic
        String res = (num % 2 == 0) ? "even" : "odd";
        System.out.print("it is a " + res + " number.");
        sc.close();
    }
}



