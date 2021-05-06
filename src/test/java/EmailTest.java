import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    public void Mail() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = false;
        try {
            result = registrationMain.Email("abc@yahoo.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
        boolean result1 = false;
        try {
            result1 = registrationMain.Email("abc-100@yahoo.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result1);
        boolean result2 = false;
        try {
            result2 = registrationMain.Email("abc.100@yahoo.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result2);
        boolean result3 = false;
        try {
            result3 = registrationMain.Email("abc111@abc.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result3);
        boolean result4 = false;
        try {
            result4 = registrationMain.Email("abc100@abc.net");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result4);
        boolean result5 = false;
        try {
            result5 = registrationMain.Email("abc.100@abc.com.au");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result5);
        boolean result6 = false;
        try {
            result6 = registrationMain.Email("abc@1.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result6);
        boolean result7 = false;
        try {
            result7 = registrationMain.Email("abc@gmail.com.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result7);
        boolean result8 = false;
        try {
            result8 = registrationMain.Email("abc");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result8);
        boolean result9 = false;
        try {
            result9 = registrationMain.Email("abc@.com.my");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result9);
        boolean result10 = false;
        try {
            result10 = registrationMain.Email("abc123@gmail.a");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result10);
        boolean result11 = false;
        try {
            result11 = registrationMain.Email("abc123@.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result11);
        boolean result12 = false;
        try {
            result12 = registrationMain.Email("abc123@.com.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result12);
        boolean result13 = false;
        try {
            result13 = registrationMain.Email(".abc@abc.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result13);
        boolean result14 = false;
        try {
            result14 = registrationMain.Email("abc()*@gmail.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result14);
        boolean result15 = false;
        try {
            result15 = registrationMain.Email("abc@%*.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result15);
        boolean result16 = false;
        try {
            result16 = registrationMain.Email("abc..2002@gmail.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result16);
        boolean result17 = false;
        try {
            result17 = registrationMain.Email("abc.@gmail.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result17);
        boolean result18 = false;
        try {
            result18 = registrationMain.Email("abc@abc@gmail.com");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result18);
        boolean result19 = false;
        try {
            result19 = registrationMain.Email("abc@gmail.com.1a");
        } catch (RegistrationMainException e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(result19);
    }
}
