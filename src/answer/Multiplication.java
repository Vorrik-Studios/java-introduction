package answer;

public class Multiplication implements Operation{

    @Override
    public float perform(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public char getOperationSymbol() {
        return '*';
    }
}
