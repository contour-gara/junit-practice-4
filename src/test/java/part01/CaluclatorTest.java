package part01;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CaluclatorTest {
    @Test
    public void multiplyで3と4の乗算結果が取得できる() {
        Caluculator caluculator = new Caluculator();
        int expected = 12;
        int actual = caluculator.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    public void multiplyで5と7の乗算結果が取得できる() {
        Caluculator caluculator = new Caluculator();
        int expected = 35;
        int actual = caluculator.multiply(5, 7);
        assertThat(actual, is(expected));
    }

    @Test
    public void divideで3と2の乗算結果が取得できる() {
        Caluculator caluculator = new Caluculator();
        float expected = 1.5f;
        float actual = caluculator.divide(3, 2);
        assertThat(actual, is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideで5と0のときIllegalArgumentExceptionを送出する() {
        Caluculator caluculator = new Caluculator();
        caluculator.divide(5, 0);
    }
}
