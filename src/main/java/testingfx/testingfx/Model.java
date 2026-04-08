package testingfx.testingfx;

public class Model {

    private final String firstNumber;
    private final String secondNumber;

    public Model(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String concatenate() {
        return firstNumber + secondNumber;
    }
}
