package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        // This test is too trivial
        assertTrue(true);
    }

    @Test
    public void testNullPointer() {
        // This test will fail due to NPE
        App app = new App();
        app.main(null);
    }
}
