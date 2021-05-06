import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {

    @Test
    public void FirstName() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = registrationMain.CheckFirstName("Ayur");
        Assertions.assertTrue(result);
    }

    @Test
    public void LastName() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = registrationMain.CheckLastName("Ninae");
        Assertions.assertTrue(result);
    }

    @Test
    public void Mail() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = registrationMain.Email("ayur@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void Number() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = registrationMain.PhoneNumber("7972910340");
        Assertions.assertTrue(result);
    }

    @Test
    public void PasswordTest() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = registrationMain.Password("Ayurrr7@n8ninawe");
        Assertions.assertTrue(result);
    }
}