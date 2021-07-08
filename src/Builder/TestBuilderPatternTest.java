package Builder;

import org.junit.Assert;
import org.junit.Test;

public class TestBuilderPatternTest {

    @Test
    public void test() {
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false).build();
        Assert.assertNotNull(comp);
        Assert.assertEquals("500 GB", comp.getHDD());
        Assert.assertTrue(comp.isBluetoothEnabled());
        Assert.assertFalse(comp.isGraphicsCardEnabled());
    }
}
