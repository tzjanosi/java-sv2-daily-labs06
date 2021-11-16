package day01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer positiveNumberContainer=new PositiveNumberContainer();
        double userInput;
        boolean isPositive;
        do{
            System.out.println("Type in a number:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Not a number!\nType in a number:");
                scanner.next();
            }
            userInput = scanner.nextDouble();
            isPositive=positiveNumberContainer.add(userInput);
        }
        while(isPositive);
        System.out.println(positiveNumberContainer.getPositiveNumberList());
    }
}
