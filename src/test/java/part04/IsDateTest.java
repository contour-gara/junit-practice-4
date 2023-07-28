package part04;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static part04.IsDate.dateOf;

public class IsDateTest {
    @Test
    public void 日付の比較() throws Exception {
//        kusa
//        kusa
//        kusa
        Date date = new Date();
        assertThat(date, is(dateOf(2023, 07, 28)));
    }
}
