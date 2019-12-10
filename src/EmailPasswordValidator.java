import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class EmailPasswordValidator {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);


        final String regexOfEmail = "[a-z]{4,12}\\.[a-z]{4,12}\\_(cs|ec|ee|me|ce|da|csf|ccv|iot)?[1][0-9]@gla.ac.in";
        final String regexOfPassword = "[a-zA-Z0-9]{4,12}";
        final Pattern patternForEmail = Pattern.compile(regexOfEmail, Pattern.MULTILINE);
        final Pattern patternForPassword = Pattern.compile(regexOfPassword, Pattern.MULTILINE);
        while (true) {
            final String email = scanner.nextLine();
            final String password = scanner.nextLine();
            final Matcher emailValidation = patternForEmail.matcher(email);
            final Matcher passwordValidation = patternForPassword.matcher(password);
            if (emailValidation.find() && passwordValidation.find()) {
                System.out.println("Welcome User");
                break;
            } else
                System.out.println("Username & password is invalid");
            counter++;
            System.out.println("remaining try :" + (3 - counter));
            if (counter == 3) {
                System.out.println("System Lcoked");
                break;
            }
        }


    }
}