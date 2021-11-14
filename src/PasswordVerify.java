import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerify {
    /*
     * passwordVerify() method to verify password entered by user is same according to regex
     * */
    public boolean passwordVerify(String password){
        if(password==null&&password.isEmpty())      //Checking input Password is empty or not
        {
            return true;
        }
        String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*d)[a-zA-Zd]{8,}$";    //Regex code for verifying Password
        Pattern pattern= Pattern.compile(regex);
        if (pattern.matcher(password).matches())        //Checking entered password matches with regex code or not.
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}