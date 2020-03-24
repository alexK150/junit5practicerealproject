package mocks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class MockitoExtensionTest {

    @Mock
    Map<String, Object> mockitoMap;

    @Test
    void setMockitoMap() {
        mockitoMap.put("Hello", "World");
    }
}
