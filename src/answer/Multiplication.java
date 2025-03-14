package answer;

public class Multiplication implements IOperation {
    @Override
    public int perform(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public char getOperationSymbol() {
        return '*';
    }
}