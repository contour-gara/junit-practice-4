package part18;

public class Calculator {
    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("y is zero.");
        }
        return x / y;
    }
}
