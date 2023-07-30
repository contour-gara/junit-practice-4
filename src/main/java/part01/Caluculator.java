package part01;

public class Caluculator {
    /**
     * 引数で与えられた2つの値を掛け合わせた値を返す
     *
     * @param x 1つ目の引数
     * @param y 2つ目の引数
     * @return xとyを掛け合わせた値
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    public float divide(int x, int y) {
        if (y == 0) throw new IllegalArgumentException("divide by zero");
        return (float) x / (float) y;
    }
}
