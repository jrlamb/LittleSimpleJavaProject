/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.company.app;

import br.com.company.modelo.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliano
 */
public class AppTest {

    private static App instance;
    private static Person person;

    public AppTest() {
        System.out.println("Called a AppTest");
    }

    @BeforeClass
    public static void setUpClass() {
        instance = new App();
        person = new Person();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        person.setFirstName("Juliano Rodrigo");
        person.setLastName("Lamb");
        person.setGender('m');
        person.setHeight(1.90);
        person.setWeight(80.0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class App.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculteIMCError() {
        System.out.println("calculteIMCError");
        double expResult = 0.0;
        double result = App.calculateIMC(person);
        assertEquals(expResult, result, 0.0);
        fail("The test failed");
    }

    @Test
    public void testCalculteIMCSuccess() {
        System.out.println("calculteIMCSucess");
        double expResult = 22.1606648199446;
        double result = App.calculateIMC(person);
        assertEquals(expResult, result, 0.0);
        assertNotNull(result);
    }

}
