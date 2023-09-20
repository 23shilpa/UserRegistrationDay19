package userregistration;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration2 {
    public static void main(String[] args) {

        String firstName = "Shilpa";
        String lastName = "Bhonde";
        String regex = "[A-Z]{1}[a-z]{3,7}";
        System.out.println("FirstName :"+firstName.matches(regex));
        System.out.println("LastName :"+lastName.matches(regex));
    }
}
