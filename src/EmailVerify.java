import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailVerify {

    /*
     * emailValidation() method for validating email entered by user is according to condition or not
     * */
    public static boolean emailValidation(String email){
        if(email==null || email.isEmpty()){
            return false;
        }
        String emailRegex="^(abc)[\\.]{1}[a-z,A-Z]{3}[\\@]{1}(bl)[\\.]{1}(co)[\\.][a-z]{2}$";//Regex code for email
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches())            //Checking regex code is matching with user input using if condition.
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
