class new{

    public static void main(String[] args) {
        int number = 5;
        String result;

        // Using ternary operator to check if the number is even or odd
        result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);
    }
}