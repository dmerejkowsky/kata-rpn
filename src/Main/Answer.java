package src.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Answer {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> operands = getOperation();

        if(operands.isEmpty()) {
            System.out.println("Expression vide.");
            return;
        }

        String operator = operands.get(operands.size() - 1);
        operands.remove(operands.size() - 1);

        for (String operand : operands) System.out.println(operand);
    }

    public static ArrayList<String> getOperation() {
        System.out.println("Write down a new expression:");
        String expression = sc.nextLine();

        return new ArrayList<>(Arrays.asList(expression.split(" ")));
    }

    public double calc(ArrayList<Double> operands, String operator) {
        OperatorStrategyFactory factory = new OperatorStrategyFactory();

        return factory.getStrategy(operator).apply(operands.get(0), operands.get(1));
    }
}
