package src;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerify {

    /*
     * passwordVerify() method to verify password entered by user is same according to regex
     * */
    public boolean passwordVerify(String password){
        if (password==null&& password.isEmpty()){
            return false;
        }
        String passwordRegex ="^[a-z,A-Z]{8,}";         //Regex for checking Password
        Pattern pattern= Pattern.compile(passwordRegex);
        if(pattern.matcher(password).matches()){        //Checking input password matching regex or not
            return true;
        }
        else
        {
            return false;
        }
    }
}
