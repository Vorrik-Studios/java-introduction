package answer;

public class Subtraction implements Operation{

    @Override
    public float perform(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public char getOperationSymbol() {
        return '-';
    }
}
