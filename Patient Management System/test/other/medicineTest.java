/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Pritchard
 */
public class medicineTest {
    
    public medicineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class medicine.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        medicine instance = new medicine();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class medicine.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        medicine instance = new medicine();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDosage method, of class medicine.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        medicine instance = new medicine();
        String expResult = "";
        String result = instance.getDosage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDosage method, of class medicine.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        String dosage = "";
        medicine instance = new medicine();
        instance.setDosage(dosage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class medicine.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        medicine instance = new medicine();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStock method, of class medicine.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        medicine instance = new medicine();
        instance.setStock(stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
