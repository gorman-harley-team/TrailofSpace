/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.curiousworkmanship.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paige
 */
public class SpaceCavesTest {
    
    public SpaceCavesTest() {
    }

    /**
     * Test of caveTrapOne method, of class SpaceCaves.
     */
    @Test
    public void testCaveTrapOne() {
        System.out.println("caveTrapOne");
        double playersAttack = 5;
        double beastsDefense = 12;
        double beastsAttack = 3;
        double playersDefense =10;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 2;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 2);
        // TODO review the generated test code and remove the default call to fail.
    }
        @Test
    public void test2CaveTrapOne() {
        System.out.println("test2");
        double playersAttack = 5;
        double beastsDefense = 4;
        double beastsAttack = 12;
        double playersDefense =4;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 1;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
    }
          @Test
    public void test3CaveTrapOne() {
        System.out.println("test3");
        double playersAttack = 12;
        double beastsDefense = 12;
        double beastsAttack = 4;
        double playersDefense =5;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 7.2;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 7.2);
        // TODO review the generated test code and remove the default call to fail.
    }
          @Test
    public void test4CaveTrapOne() {
        System.out.println("test4");
        double playersAttack = 0;
        double beastsDefense = 6;
        double beastsAttack = 3;
        double playersDefense =9;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 0;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
            @Test
    public void test5CaveTrapOne() {
        System.out.println("test5");
        double playersAttack = 6;
        double beastsDefense = 12;
        double beastsAttack = 8;
        double playersDefense =2;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 4.5;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 4.5);
        // TODO review the generated test code and remove the default call to fail.
    }
            @Test
    public void test6CaveTrapOne() {
        System.out.println("test6");
        double playersAttack = 12;
        double beastsDefense = 9;
        double beastsAttack = 3;
        double playersDefense =5;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 7.2;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 7.2);
        // TODO review the generated test code and remove the default call to fail.
    }
            @Test
    public void test7CaveTrapOne() {
        System.out.println("test7");
        double playersAttack = 12;
        double beastsDefense = 8;
        double beastsAttack = 6;
        double playersDefense =4;
        SpaceCaves instance = new SpaceCaves();
        double expResult = 4;
        double result = instance.caveTrapOne(playersAttack, beastsDefense, beastsAttack, playersDefense);
        assertEquals(expResult, result, 4);
        // TODO review the generated test code and remove the default call to fail.
    }
}
