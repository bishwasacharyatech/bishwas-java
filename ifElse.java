import java.util.Scanner;

class ifELse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int month = sc.nextInt();
        String season = fool;

        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        if (month == 3 || month == 4 || month == 5)
            season = "Auturm";
        if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        if (month == 9 || month == 10 || month == 11)
            season = "Spring";
        if (month < 12)
            season = "Spring";
        System.out.println("It is " + season);

    }
}