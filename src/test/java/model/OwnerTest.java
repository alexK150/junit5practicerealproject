package model;

import org.junit.jupiter.api.Test;
import interfaces.ModelTests;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "John", "Doe");
        owner.setCity("New York");
        owner.setTelephone("1111-111-11");

        assertAll("Assert of all props",
                () -> assertAll("Person Props",
                        () -> assertEquals("John", owner.getFirstName(), "First Name is wrong"),
                        () -> assertEquals("Doe", owner.getLastName(), "Last Name is wrong")),
                () -> assertAll("Owner Props",
                        () -> assertEquals("New York", owner.getCity(), "City is wrong"),
                        () -> assertEquals("1111-111-11", owner.getTelephone(), "Phone number is wrong")
                )
        );
    }
}