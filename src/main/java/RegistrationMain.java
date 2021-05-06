import java.util.Scanner;
import java.util.regex.Pattern;

public class RegistrationMain {

    public boolean CheckFirstName(String firstName) throws RegistrationMainException {

        if (firstName.matches("^[A-Z]{1}[a-z]{2,}$"))
            return true;
        else
            throw new RegistrationMainException("Invalid First Name");
    }

    public boolean CheckLastName(String lastName) throws RegistrationMainException {

        if (lastName.matches("^[A-Z]{1}[a-z]{2,}$"))
            return true;
        else
            throw new RegistrationMainException("Invalid last Name");
    }

    public boolean Email(String email) throws RegistrationMainException {

        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return true;
        else
            throw new RegistrationMainException("Invalid Email");
    }

    public boolean PhoneNumber(String phoneNumber) throws RegistrationMainException {

        if (phoneNumber.matches("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$"))
            return true;
        else
            throw new RegistrationMainException("Invalid Phone Number");
    }

    public boolean Password(String password) throws RegistrationMainException {

        if (password.matches("^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])[A-Za-z0-9!@#$%^&*?]{8,}$"))
            return true;
        else
            throw new RegistrationMainException("Invalid Password");
    }
}

