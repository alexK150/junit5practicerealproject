package controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index());
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equalsIgnoreCase(indexController.oupsHandler()), () -> "Wrong output");
    }
}