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
    @Test
    public void testGetClassNumber(){
        if (this.getClassNumber()<=45) {
         Assert.fail("Число меньше 45");
        }

    }
}
