import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        System.out.println("Enter your operator (+,-,*,/):");
        char ch = input.next().charAt(0);

        double result;

        switch (ch) {
            case '+': result = num1 + num2;
            break;

            case '-': result = num1 - num2;
            break;

            case '*': result = num1 * num2;
            break;

            case '/': result = num1 / num2;
            break;

            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println(num1 + " " + ch + " " + num2 + "  = " + result);
    }
}