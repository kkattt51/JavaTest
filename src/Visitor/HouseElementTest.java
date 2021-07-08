package Visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class HouseElementTest {
    private String correctValue;
    private String expectedValue;


    public HouseElementTest(String corVal, String expVal){
        this.correctValue = corVal;
        this.expectedValue = expVal;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        House h = new House();
        Foundation f = new Foundation();
        Walls w = new Walls();
        Roof r = new Roof();

        HouseElementVisitor1 visitor1 = new HouseElementVisitor1();

        return Arrays.asList(new Object[][]{
                {visitor1.visit(h), "Building house"},
                {visitor1.visit(f), "Filling foundation"},
                {visitor1.visit(w), "Painting walls"},
                {visitor1.visit(r), "Covering roof"},
        });
    }
    @Test
     public void valueOfVisiting(){
        assertEquals(expectedValue, correctValue );

    }

}