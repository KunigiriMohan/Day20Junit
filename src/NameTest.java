import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    @ParameterizedTest
    @ValueSource(strings= {"moh","Moh","Moj","Ram"})           //Giving set of names as a parameters
    public void validateName(String values) {
        Name name= new Name();          //Creating object of name class
        assertEquals(true,name.validateName(values));
    }

}