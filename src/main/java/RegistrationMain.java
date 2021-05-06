import java.util.Scanner;
import java.util.regex.Pattern;

public class RegistrationMain {

    public boolean CheckFirstName(String firstName) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the first name :");
        //String firstName = sc.nextLine();

        boolean result  = Pattern.compile("^[A-Z][A-Za-z]{2,}").matcher(firstName).matches();
        if(result) {
            System.out.println("Valid First Name");
        }
        else {
            System.out.println("Invalid First Name");
        }
        return result;
    }

    public boolean CheckLastName(String lastName) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Last Name :");
        //String lastName = sc.nextLine();

        boolean result  = Pattern.compile("^[A-Z][A-Za-z]{2,}").matcher(lastName).matches();
        if(result) {
            System.out.println("Valid Last Name");
        }
        else {
            System.out.println("Invalid Last Name");
        }
        return result;
    }

    public boolean Email(String email) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Email :");
        //String email = sc.nextLine();

        boolean result = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(email).matches();
        if(result) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
        return result;
    }

    public boolean PhoneNumber(String phoneNumber) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Phone Number :");
        //String phoneNumber = sc.nextLine();

        boolean result  = Pattern.compile("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$").matcher(phoneNumber).matches();
        if(result) {
            System.out.println("Valid Phone Number");
        }
        else {
            System.out.println("Invalid Phone Number");
        }
        return result;
    }

    public boolean Password(String password) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Password :");
        //String password = sc.nextLine();

        boolean result  = Pattern.compile("^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])[A-Za-z0-9!@#$%^&*?]{8,}$").matcher(password).matches();
        if(result) {
            System.out.println("Valid Password ");
        }
        else {
            System.out.println("Invalid Password");
        }
        return result;
    }
}
