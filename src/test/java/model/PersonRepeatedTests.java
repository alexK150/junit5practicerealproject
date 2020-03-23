package model;

import interfaces.ModelRepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTests implements ModelRepeatedTest {
    @RepeatedTest(value = 10, name = "{displayName}: {currentRepetition} - {totalRepetitions}")
    @DisplayName("Repeated Test")
    void myRepeatedTest() {
        //todo - implementation
    }

    @RepeatedTest(5)
    void dependInjection(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo);
    }

    @RepeatedTest(value = 3, name = "{displayName}: {currentRepetition} - {totalRepetitions}")
    @DisplayName("Assignment")
    void withPlaceholder() {
        System.out.println("Test");
    }
}
