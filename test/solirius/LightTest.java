/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solirius;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kolodko
 */
public class LightTest {
    
    public LightTest() {
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

    
    final String[] COLORS = {"Red","Blue", "White"};
    final String OFF = "OFF";
    final String ON = "ON";
    
    /**
     * Test of flipSwitch method, of class Light.
     * It should return ON when switched right after initialization
     */
    @Test
    public void testFlipSwitch1() {
        System.out.println("It shourd return ON");
        Light instance = new Light(COLORS[0]);
        String expResult = ON;
        String result = instance.flipSwitch();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of flipSwitch method, of class Light.
     * It should return back to OFF on the second switch.
     */
    @Test
    public void testFlipSwitch2() {
        System.out.println("It shourd return OFF");
        Light instance = new Light(COLORS[0]);
        String expResult = OFF;
        instance.flipSwitch();
        String result = instance.flipSwitch();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getColor method, of class Light.
     * It should return the color provided on initialization.
     */
    @Test
    public void testGetColor1() {
        final int INDEX = 0;
        System.out.println("It should return the color provided on initialization");
        Light instance = new Light(COLORS[INDEX]);
        String expResult = COLORS[INDEX];
        String result = instance.getColor();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getColor method, of class Light.
     * It should return the color provided on initialization.
     */
    @Test
    public void testGetColor2() {
        final int INDEX = 1;
        System.out.println("It should return the color provided on initialization");
        Light instance = new Light(COLORS[INDEX]);
        String expResult = COLORS[INDEX];
        String result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getState method, of class Light.
     * It should return OFF when called after the initial initialization
     */
    @Test
    public void testGetState1() {
        System.out.println("It shourd return ON");
        Light instance = new Light(COLORS[0]);
        String expResult = OFF;
        String result = instance.getState();
        assertEquals(expResult, result);
    }
    /**
     * Test of getState method, of class Light.
     * It should return ON when called after one switch
     */
    @Test
    public void testGetState2() {
        System.out.println("It shourd return ON");
        Light instance = new Light(COLORS[0]);
        String expResult = ON;
        instance.flipSwitch();
        String result = instance.getState();
        assertEquals(expResult, result);
    }
    
}
