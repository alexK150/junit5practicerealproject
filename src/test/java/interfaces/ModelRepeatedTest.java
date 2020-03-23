package interfaces;

import org.junit.jupiter.api.*;

@Tag("repeated")
public interface ModelRepeatedTest {

    @BeforeEach
    default void testInfo(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo);
    }
}
