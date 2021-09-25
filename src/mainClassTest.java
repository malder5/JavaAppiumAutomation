import org.junit.Assert;
import org.junit.Test;

public class mainClassTest extends mainClass {
    @Test
    public void testGetLocalNumber(){
        int number = this.getLocalNumber();
        if (number != 14) {
            Assert.fail("Текущее число не равно 14");

        }
    }
}
