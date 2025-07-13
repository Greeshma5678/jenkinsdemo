package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld hw = new HeloWorld();
        assertEquals("Hello, Jenkins CI/CD!", hw.getMessage());
    }
}
