package interfaces;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;

@Tag("controllers")
public interface ControllerTests {

    @BeforeAll
    default void beforeAll(){
        System.out.println("Controller Interface");
    }
}
