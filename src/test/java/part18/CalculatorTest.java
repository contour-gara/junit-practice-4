package part18;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest extends TestCase {
    @Test
    public void test6を３で割ると2を返す() throws Exception {
        // setup
        Calculator sut = new Calculator();
        int expected = 2;

        // execute
        int actual = sut.divide(6, 3);

        // verify
        assertThat(actual, is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test第2引数に0を指定したとき() throws Exception {
        // setup
        Calculator sut = new Calculator();

        //execute
        sut.divide(1, 0);
        // verify
    }
}