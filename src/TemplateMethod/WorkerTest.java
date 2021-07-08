package TemplateMethod;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WorkerTest {
    @Test
    public void salary() throws Exception {
        int expected = 50;
        Worker worker = new Builder1();
        worker.work();
        assertEquals(expected, worker.salary());
    }

}

