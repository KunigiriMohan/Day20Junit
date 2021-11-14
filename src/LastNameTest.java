import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LastNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"Raj","Raj","Raj","Ram","Moh"})
    void validateName(String names) {
        LastName obj = new LastName();
        assertEquals(true,obj.validateName(names));
    }
}