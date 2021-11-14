import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import src.PasswordVerifyUC5;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @ParameterizedTest                  //Declaring Test as parameterized Test
    @ValueSource(strings={"abcdefghi","abc","abcdefgh","Abdfddfdf"})            //declaring values through valueSource
    void passwordVerify(String password) {
        PasswordVerify obj =new PasswordVerify();             //Creating object of PasswordVerifyUC5 class
        assertEquals(true,obj.passwordVerify(password));
    }
}