import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @ParameterizedTest
    @ValueSource(strings = {"avfasdAa","Afdfdfds","fadfsdfsdsd","AAAAAAAADFDDFF"})
    void passwordVerify(String password) {
        PasswordVerify obj =new PasswordVerify();             //Creating object of PasswordVerifyUC5 class
        assertEquals(true,obj.passwordVerify(password));
    }
}