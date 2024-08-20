package src;

public class CalculatorFacede {
    public double calculate(String operator, double a, double b) throws Exception {
        Calculator calc = new Calculator();

        return switch (operator) {
            case "+" -> calc.add(a, b);
            case "-" -> calc.sub(a, b);
            default -> throw new Exception("Error");
        };
    }
}
