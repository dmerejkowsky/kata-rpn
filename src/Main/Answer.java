package src.Main;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write down a new expression:");
        String expression = sc.nextLine();

        String[] operands = expression.split(" ");

        for (String operand : operands) System.out.println(operand);
    }

}
