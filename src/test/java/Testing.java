import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {

    @Test
    public void FirstName() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = false;
        try {
            result = registrationMain.CheckFirstName("Ayur");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        RegistrationMain registrationMain =  new RegistrationMain();
        try {
            registrationMain.CheckFirstName("Ab");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void LastName() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = false;
        try {
            result = registrationMain.CheckLastName("Ninawe");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        RegistrationMain registrationMain =  new RegistrationMain();
        try {
            registrationMain.CheckLastName("Ni");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Mail() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = false;
        try {
            result = registrationMain.Email("Ninawe@gmail.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void Number() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = false;
        try {
            result = registrationMain.PhoneNumber("7972910340");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenNotExactTen_ShouldReturnFalse() {
        RegistrationMain registrationMain =  new RegistrationMain();
        try {
            registrationMain.PhoneNumber("91 124585454454");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void PasswordTest() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = false;
        try {
            result = registrationMain.Password("Ayurrr7@n8ninawe");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }


    @Test
    public void givenPassword_WhenMoreThanOneSpecialChar_ShouldReturnFalse() {
        RegistrationMain registrationMain =  new RegistrationMain();
        try {
            registrationMain.Password("abcA12");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
    }


}