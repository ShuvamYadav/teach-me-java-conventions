import org.junit.jupiter.api.*;

public class PowerFinderTest {
    @Test
    public void oneToThePowerOne() {
        Assertions.assertEquals(PowerFinder.findPowerOf(1,1),1);
    }

    @Test
    public void twoToThePowerOne() {
        Assertions.assertEquals(PowerFinder.findPowerOf(2,1),2);
    }

    @Test
    public void twoToThePowerTwo() {
        Assertions.assertEquals(PowerFinder.findPowerOf(2,2),4);
    }

    @Test
    public void threeToThePowerTwo() {
        Assertions.assertEquals(PowerFinder.findPowerOf(3,2),9);
    }
}
