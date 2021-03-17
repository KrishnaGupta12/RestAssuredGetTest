package org.example;

import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

public class StandardsTest {

    @BeforeAll
   static void initAll()
    {
        System.out.println(" Before all Init Method Declaration ");
    }

    @BeforeEach
    void init() {

        System.out.println("Before Each Init Method Declaration");
    }

    @Test
   public void succeedingTest()
    {
        System.out.println("succeedingTest Method");
    }

    @Test
    @Disabled("for demonstration purposes")
   public void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

}


