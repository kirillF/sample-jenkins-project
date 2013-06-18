package com.bigfatplayer.hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for {@link App}
 *
 *
 */
@RunWith(JUnit4.class)
public class AppTest
{
    @Test
    public void simple()
    {
        assertTrue(true);
    }

    @Test
    public void testAdd()
    {
        App app = new App();
        int result = app.add(2, 2);
        assertEquals(4, result);
    }
}
