package answer;

public class Calculator {
    private final Operation operation;
    private float firstNumber;
    private float secondNumber;

    public Calculator(Operation operation) { this.operation = operation; }

    public float calculate(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return operation.perform(firstNumber, secondNumber);
    }

    public String getOperationString() {
        return firstNumber + " " + operation.getOperationSymbol() + " " + secondNumber;
    }
}