package part18;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StringUtilsTest {
    private StringUtils sut;

    @Before
    public void setUp() throws Exception {
        sut = new StringUtils();
    }

    @Test
    public void aaaを渡すとaaaを返す() throws Exception {
        // setup
        String expected = "aaa";

        // execute
        String actual = sut.toSnakeCase("aaa");

        // assert
        assertThat(actual, is(expected));
    }

    @Test
    public void HelloWorldを渡すとhello_worldを返す() throws Exception {
        // setup
        String expected = "hello_world";

        // execute
        String actual = sut.toSnakeCase("HelloWorld");

        // assert
        assertThat(actual, is(expected));
    }

    @Test
    public void practiceJunitを渡すとpractice_junitを返す() throws Exception {
        // setup
        String expected = "practice_junit";

        // execute
        String actual = sut.toSnakeCase("practiceJunit");

        // assert
        assertThat(actual, is(expected));
    }
}