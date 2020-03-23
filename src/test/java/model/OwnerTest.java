package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import interfaces.ModelTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @DisplayName("ParamTest")
    @ParameterizedTest(name = "{displayName} - [{index}] {argumentsWithNames}")
    @ValueSource(strings = {"Alex", "Hello", "World"})
    void paramTest(String val) {
        System.out.println(val);
    }

    @DisplayName("Enum Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {argumentsWithNames}")
    @EnumSource(OwnerType.class)
    void enumTest(OwnerType type) {
        System.out.println(type);
    }

    @DisplayName("Comma Separated Values Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {argumentsWithNames}")
    @CsvSource({
            "Russia, 7, +7",
            "Ukraine, 38, +38",
            "Belarus, 8, +8",
    })
    void csvTest(String countryName, String val1, String val2) {
        System.out.println(countryName + ": " + val1 + " " + val2);
    }

    @DisplayName("Comma Separated Values Test with file")
    @ParameterizedTest(name = "{displayName} - [{index}] {argumentsWithNames}")
    @CsvFileSource(resources = "/input.csv", numLinesToSkip = 1)
    void csvFileTest(String countryName, int val1, int val2) {
        System.out.println(countryName + ": " + val1 + " " + val2);
    }
}