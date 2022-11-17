import java.util.Objects;

public class Numbers {
    private final int numberOne;
    private final int numberTwo;

    public Numbers(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    @Override
    public String toString() {
        return getNumberOne() + " * " + getNumberTwo() + " = " + getNumberOne() * getNumberTwo();
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (!(o instanceof Numbers)) {
            result = false;
        } else {
            Numbers numbers = (Numbers) o;
            result = numberOne == numbers.numberOne && numberTwo == numbers.numberTwo && numberOne == numbers.numberTwo && numberTwo == numbers.numberOne;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOne, numberTwo);
    }
}
