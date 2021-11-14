import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PasswordVerifyTest {

    @ParameterizedTest
    @ValueSource(strings = {"avfasdA1","Afdfdfds","fadfsdfsd2sd","AAAAAAAADFDDFF"})
    void passwordVerify(String password) {
        PasswordVerify obj =new PasswordVerify();             //Creating object of PasswordVerifyUC5 class
        assertEquals(true,obj.passwordVerify(password));
    }
}