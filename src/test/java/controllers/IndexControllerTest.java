package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import interfaces.ControllerTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest implements ControllerTests {

    private IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index());
    }

    @DisplayName("throws expected exception")
    @Test
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class, () -> {
            indexController.oopsHandler();
        });
    }

    /**
     * Assumption test
     */
    @Test
    void testAssumption() {
        assumeTrue("Alex".equalsIgnoreCase("Alex"));
    }

    /**
     * Conditional tests
     */
    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMcOs() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "User1")
    @Test
    void testOnUser1() {
    }

    @EnabledIfEnvironmentVariable(named = "User", matches = "Alex")
    @Test
    void testOnAlex() {
    }
}