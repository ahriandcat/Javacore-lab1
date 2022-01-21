package validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);
    public boolean validatePhone(String phone){
        String accountNumberPattern = "^[0-9]{10,11}$";
        if (Pattern.matches(accountNumberPattern,phone)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validateEmail(String email){
        String emailPattern = "^[\\w]+@([a-z]+\\.[a-z]{3})$";
        if (Pattern.matches(emailPattern,email)){
            return true;
        }
        else{
            return false;
        }
    }

}
