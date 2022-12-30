import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumWorksCorrectOne() {
        //When
        int actual = SumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrectThree() {
        //When
        int actual = SumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrectException() {
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> SumCalculator.sum(0));
    }
}
