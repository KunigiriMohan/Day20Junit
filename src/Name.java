import java.util.Scanner;
import java.util.regex.Pattern;

public class Name {
    /*
    * validateName() method to check given name is in correct format or not
    * */
    public boolean validateName(String name ){
        if ( name == null || name.isEmpty()){
            return false;
        }
        String nameRegex = "^[A-Z a-z]{3}";                     //Regex code for name
        Pattern pattern = Pattern.compile(nameRegex);
        if (pattern.matcher(name).matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
