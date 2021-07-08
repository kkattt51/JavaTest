package AbstractFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MyAbstractFactoryTest {


    @BeforeClass
    public static void setUp() {
        HouseCreator expected = new CottageCreator();
        House h1 = new Cottage();
    }

    @Test
    public void testCreate() {
        System.out.println("Testing create function");
        HouseCreator expected = new CottageCreator();
        House h1 = new Cottage();
        House h2 = expected.create();
        assertEquals(h2.getClass(), h1.getClass());

    }

    @AfterClass
    public static void setDown() {
        HouseCreator expected = null;
        House h1 = null;
    }
}