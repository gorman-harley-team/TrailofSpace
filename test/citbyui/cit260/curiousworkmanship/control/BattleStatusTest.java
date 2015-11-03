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
public class BattleStatusTest {
    
    public BattleStatusTest() {
    }

    /**
     * Test of mathTrapOne method, of class BattleStatus.
     */
    @Test
    public void testMathTrapOne() {
        System.out.println("mathTrapOne");
        BattleStatus instance = new BattleStatus();
        boolean expResult = false;
        boolean result = instance.mathTrapOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //test 2
    //does not pass if expected result equals true. but the test runs.
        @Test
    public void test2MathTrapOne() {
        System.out.println("test2");
        BattleStatus instance = new BattleStatus();
        boolean expResult = false;
        boolean result = instance.mathTrapOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
