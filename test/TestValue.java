import org.junit.Test;

import static org.junit.Assert.*;

public class TestValue {
    @Test
    public void shouldReturnTrueWhenGivenTwoEuro(){
        assertTrue(new Euro(10) == new Euro(10));
    }

    @Test
    public void shouldReturnTrueWhenGivenTwoEuro2() {
        assertSame(new Euro(10) , new Euro(10));
    }

    @Test
    public void shouldReturnTrueWhenGivenTwoEuro3() {
        assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void should_return_not_equal_when_given_two_Euro_in_different_value() {
        assertNotEquals(new Euro(10),new Euro(5));
    }


}
