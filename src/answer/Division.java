package answer;

public class Division implements Operation{

    @Override
    public float perform(float firstNumber, float secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("ERROR: Can't divide by 0");
            return Integer.MIN_VALUE;
        }
    }

    @Override
    public char getOperationSymbol() {
        return '/';
    }
}
