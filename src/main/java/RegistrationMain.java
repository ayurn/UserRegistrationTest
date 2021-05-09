import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegistrationMain {

    public boolean matchpattern(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        if(matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    ValidateEntry validateFirstName = (String firstName) -> {
        String regex = "(^[A-Z]{1}[a-z]{2,}$)";
        if(matchpattern(regex , firstName))
            return "true";
        else
            throw new RegistrationMainException("Invalid First Name");
    };

    ValidateEntry validateLastName = (String lastName) -> {

        if(matchpattern("(^[A-Z]{1}[a-z]{2,}$)" , lastName))
            return "true";
        else
            throw new RegistrationMainException("Invalid last Name");
    };

    ValidateEntry validateEmail = (String email) -> {
        if(matchpattern("^[a-zA-Z0-9]+[-+.]?+[A-Za-z0-9]+[@]+[A-Za-z0-9]+[.][a-z]{2,}+[.]?+([a-z]{2,})?$" , email))
            return "true";
        else
            throw new RegistrationMainException("Invalid Email");
    };

    ValidateEntry validateMobile = (String mobile) -> {

        if(matchpattern("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$" , mobile))
            return "true";
        else
            throw new RegistrationMainException("Invalid Phone Number");
    };

    ValidateEntry validatePassword = (String password) -> {

        if(matchpattern("^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$" , password))
            return "true";
        else
            throw new RegistrationMainException("Invalid Password");
    };
}

