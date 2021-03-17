package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.BooleanSupplier;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionMethodTests {

    @Test
    public void whenAssertingArraysEqualities_thaEqual() {
        char[] expected = {'k', 'r', 'i', 's', 'h', 'n', 'a'};
        char[] actual = "krishna".toCharArray();

        assertArrayEquals(expected, actual, "Array Should Be Equal");
    }

    @Test
    public void whenAssertingEquality_thanEqual() {
        float square = 3 * 3;
        float rectangle = 3 * 3;

        assertEquals(square, rectangle);
    }

    public void whenAssertingEqualityWithDelta_thanEqual() {
        float square = 2 * 2;
        float rectangle1 = 3 * 2;
        float delta = 2;
        assertEquals(square, rectangle1, delta);
    }
    @Test
    public void whenAssertingConditions_thanVarified() {
        assertTrue(5 > 4, "5 is Greterthan 4");
        assertTrue(null == null, "null is equal null");
    }
    @Test
    public void givenBooleanSupplier_whenAssertingCondition_thanVarified() {
        BooleanSupplier condition = () -> 5 > 6;
        assertFalse(condition, "5 is not Greterthan 6");
    }
    @Test
    public void whenAssertingNotNull_thenTrue() {
        Object dog = new Object();
        dog.hashCode();
        System.out.println(dog);

        assertNotNull(dog, () -> "The dog should not be null");

    }
    @Test
    public void whenAssertingNull_thenTrue() {
        Object cat = null;
        System.out.println(cat);

        assertNull(cat, () -> "The cat should be null");
    }
    /*When we want to assert that the expected and the actual refer to the same Object, we must use the assertSame assertion:*/
    @Test
    public void whenAssertingSameObject_thenSuccessfull() {
        String language = "Java";
        Optional<String> optional = Optional.of(language);

        assertSame(language, optional.get());
    }

    @Test
    public void givenMultipleAssertion_whenAssertingAll_thenOK() {
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertEquals((Byte) null, null, "null is equal to null")
        );
    }
            /*assertIterableEquals*/
            @Test
            public void givenTwoLists_whenAssertingIterables_thenEquals() {
                Iterable<String> al = new ArrayList<>(asList("Java", "Junit", "Test"));
                Iterable<String> ll = new LinkedList<>(asList("Java", "Junit", "Test"));

                assertIterableEquals(al, ll);
            }



}
