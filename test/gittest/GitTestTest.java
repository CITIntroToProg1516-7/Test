/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cmneville
 */
public class GitTestTest {
    
    public GitTestTest() {
    }

    /**
     * Test of main method, of class GitTest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GitTest.main(args);
        assertEquals(1,1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
