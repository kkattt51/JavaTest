package Facade;

import org.junit.Assert;
import org.junit.Test;


public class ArchitectorTest {
    @Test
    public void testStartWorking() throws Exception {
        Architector architector = new Architector();
        architector.startWorking();
        Assert.assertEquals(3, architector.getWorkers().size());
    }

}