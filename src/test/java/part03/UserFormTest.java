package part03;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UserFormTest {
    @Test
    public void isValidはuserNameとpasswordが空でない場合にtrueを返す() throws Exception {
        // setup
        UserForm sut = new UserForm("user01", "1234");
        Boolean expected = true;

        // execute
        Boolean actual = sut.isValid();

        // assert
        assertThat(actual, is(expected));
    }
}