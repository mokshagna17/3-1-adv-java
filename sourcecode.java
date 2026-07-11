import java.util.*;

class CalculatorChat {

    Scanner sc = new Scanner(System.in);

    public char startConversation() {

        System.out.print("You : ");
        String greeting = sc.nextLine();

        if (greeting.equalsIgnoreCase("Hi")) {

            System.out.println("Calculator : Hello!");
            System.out.println("Calculator : What do you want?");
            System.out.print("You : ");

            char operator = sc.next().charAt(0);
            sc.nextLine(); 

            return operator;

        } else {

            System.out.println("Calculator : Please type 'Hi' to start the conversation.");
            return 'X';
        }
    }

    public void performCalculation(char operator) {

        if (operator == 'X')
            return;

        System.out.println("Calculator : Enter two numbers.");

        System.out.print("You : ");
        double num1 = sc.nextDouble();

        System.out.print("You : ");
        double num2 = sc.nextDouble();

        sc.nextLine(); 

        switch (operator) {

            case '+':
                System.out.println("Calculator : Answer = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Calculator : Answer = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Calculator : Answer = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("Calculator : Answer = " + (num1 / num2));
                else
                    System.out.println("Calculator : Cannot divide by zero.");
                break;

            default:
                System.out.println("Calculator : Invalid Operator.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        CalculatorChat obj = new CalculatorChat();

        String choice;

        do {

            char operator = obj.startConversation();

            obj.performCalculation(operator);

            System.out.print("\nCalculator : Do you want to continue? (yes/no): ");
            choice = obj.sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Calculator : Thank you! Goodbye.");

        obj.sc.close();
    }
}
