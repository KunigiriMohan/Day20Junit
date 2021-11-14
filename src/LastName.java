import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {
    /*
     * validateName() method to check given name is in correct format or not
     * */
    public boolean validateName(String lastname ){
        if ( lastname == null || lastname.isEmpty()){
            return false;
        }
        String nameRegex = "^[A-Z]{1}[A-Z a-z]{2}";                     //Regex code for name
        Pattern pattern = Pattern.compile(nameRegex);
        if (pattern.matcher(lastname).matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
