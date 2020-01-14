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
import static org.junit.Assert.*;

/**
 *
 * @author Alex Pritchard
 */
public class userTest {
    
    public userTest() {
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
     * Test of getName method, of class user.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        user instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class user.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        user instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class user.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        user instance = null;
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class user.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        user instance = null;
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class user.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        user instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class user.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        user instance = null;
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class user.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        user instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class user.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        user instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class user.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        user instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class user.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        user instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class userImpl extends user {

        public userImpl() {
            super("", "", "", "", "");
        }
    }
    
}
