import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    public void Mail() {
        RegistrationMain registrationMain = new RegistrationMain();
        boolean result = registrationMain.Email("abc@yahoo.com");
        Assertions.assertTrue(result);
        boolean result1 = registrationMain.Email("abc-100@yahoo.com");
        Assertions.assertTrue(result1);
        boolean result2 = registrationMain.Email("abc.100@yahoo.com");
        Assertions.assertTrue(result2);
        boolean result3 = registrationMain.Email("abc111@abc.com");
        Assertions.assertTrue(result3);
        boolean result4 = registrationMain.Email("abc100@abc.net");
        Assertions.assertTrue(result4);
        boolean result5 = registrationMain.Email("abc.100@abc.com.au");
        Assertions.assertTrue(result5);
        boolean result6 = registrationMain.Email("abc@1.com");
        Assertions.assertTrue(result6);
        boolean result7 = registrationMain.Email("abc@gmail.com.com");
        Assertions.assertTrue(result7);
        boolean result8 = registrationMain.Email("abc");
        Assertions.assertFalse(result8);
        boolean result9 = registrationMain.Email("abc@.com.my");
        Assertions.assertFalse(result9);
        boolean result10 = registrationMain.Email("abc123@gmail.a");
        Assertions.assertFalse(result10);
        boolean result11 = registrationMain.Email("abc123@.com");
        Assertions.assertFalse(result11);
        boolean result12 = registrationMain.Email("abc123@.com.com");
        Assertions.assertFalse(result12);
        boolean result13 = registrationMain.Email(".abc@abc.com");
        Assertions.assertFalse(result13);
        boolean result14 = registrationMain.Email("abc()*@gmail.com");
        Assertions.assertFalse(result14);
        boolean result15 = registrationMain.Email("abc@%*.com");
        Assertions.assertFalse(result15);
        boolean result16 = registrationMain.Email("abc..2002@gmail.com");
        Assertions.assertFalse(result16);
        boolean result17 = registrationMain.Email("abc.@gmail.com");
        Assertions.assertFalse(result17);
        boolean result18 = registrationMain.Email("abc@abc@gmail.com");
        Assertions.assertFalse(result18);
        boolean result19 = registrationMain.Email("abc@gmail.com.1a");
        Assertions.assertFalse(result19);
    }
}
