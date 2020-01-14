/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytests;

import accounts.user;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import other.notification;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Pritchard
 */
public class notificationTest {
    
    public notificationTest() {
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
     * Test of getUser method, of class notification.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        notification instance = null;
        user expResult = null;
        user result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllOneType method, of class notification.
     */
    @Test
    public void testGetAllOneType() {
        System.out.println("getAllOneType");
        notification instance = null;
        int expResult = 0;
        int result = instance.getAllOneType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllOneType method, of class notification.
     */
    @Test
    public void testSetAllOneType() {
        System.out.println("setAllOneType");
        int type = 0;
        notification instance = null;
        instance.setAllOneType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotification method, of class notification.
     */
    @Test
    public void testGetNotification() {
        System.out.println("getNotification");
        notification instance = null;
        String expResult = "";
        String result = instance.getNotification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
