import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailVerifyTest {

    @ParameterizedTest
    @ValueSource(strings={"abc.xyz@bl.co.in","ab.Xyz@bl.com.in","abc.abcddd@bl>co.in","abc.abc@bl.co.in"})  //creating arguments in value source
    void emailValidation(String email) {
        EmailVerify emailVerify= new EmailVerify();                 //Creating object of Email verify class
        assertEquals(true,emailVerify.emailValidation(email));          //Testing method
    }
}