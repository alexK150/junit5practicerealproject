package model;

import interfaces.ModelTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupAssertionsTest() {
        Person person = new Person(2L, "Alex", "Smith");

        assertAll("Test Prop set",
                () -> assertEquals("Alex", person.getFirstName()),
                () -> assertEquals("Smith", person.getLastName()));
    }

    @Test
    void groupAssertionsTestMsgs() {
        Person person = new Person(1L, "Alex", "Smith");

        assertAll("Test Prop Set",
                () -> assertEquals("Alex", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Smith", person.getLastName(), "Last Name Failed"));
    }
}