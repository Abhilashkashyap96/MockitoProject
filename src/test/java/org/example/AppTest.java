package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static Calculator calculator = null;
    CalculatorService service = Mockito.mock(CalculatorService.class);

    @Before
    public  void setup(){
         calculator = new Calculator(service);
         System.out.println("Constructing the class before testing");
    }

    @Test
    public void testAdd(){
        System.out.println("Testing add number");
        when(service.operation(2,3)).thenReturn(5);
        assertEquals(10, calculator.perform(2,3));
        System.out.println("Hello");
    }
}
