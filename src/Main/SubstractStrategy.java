package src.Main;

class SubstractStrategy implements OperatorStrategy {
    public double apply(double a, double b) {
        return a - b;
    }
}