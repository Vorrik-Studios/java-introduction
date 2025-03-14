package answer;

public class Calculator {
    private IOperation operation;
    private int firstNumber;
    private int secondNumber;

    public Calculator(IOperation operation) {
        this.operation = operation;
    }

    public int calculate(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return operation.perform(firstNumber, secondNumber);
    }

    public String getOperationString() {
        return firstNumber + " " + operation.getOperationSymbol() + " " + secondNumber;
    }
}