package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupAssertionsTest() {
        Person person = new Person((long) 12, "Alex", "Smith");

        assertAll("Test Prop set",
                () -> assertEquals(person.getFirstName(), "Alex"),
                () -> assertEquals(person.getLastName(), "Smith"));
    }

    @Test
    void groupAssertionsTestMsgs() {
        Person person = new Person((long) 13, "Alex", "Smith");

        assertAll("Test Prop Set",
                () -> assertEquals(person.getFirstName(), "Alex", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Smith", "Last Name Failed"));
    }
}