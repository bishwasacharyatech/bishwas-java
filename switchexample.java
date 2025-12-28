
import java.util.Scanner;

public class switchexample {

    public static void main(String[] args) {
        System.out.println("what is the capital city of Nepal?");
        System.out.println("1.Kathmandu");
        System.out.println("2.Banepa");
        System.out.println("3.Panauti");
        System.out.println("4.Lalitpur");
        System.out.println("5.China");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose your choice:");
        String answer = sc.nextLine().toLowerCase();
        switch (answer) {
            case "1":
                System.out.println("Congratulations! your answer is correct");
                break;

            case "2":
                System.out.println("your answer is wrong");
                break;
            case "3":
                System.out.println("your answer is wrong");
                break;
            case "4":
                System.out.println("your answer is wrong");
                break;
            case "5":
                System.out.println("you fool china is a country not a city");
                break;
            default:
                System.out.println("The option is not available in the list");
                break;
        }
        sc.close();
    }
}