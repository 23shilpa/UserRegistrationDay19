package userregistration;

public class UserRegistration3 {
    public static void main(String[] args) {


        String firstName = "Shilpa";
        String gmail = "abc.xyz@bl.co.in";
        String regex = "[A-Z]{1}[a-z]{3,7}";
        String emailregex = "[a-zA-Z0-9._%+-]+@bl.co.in";
        System.out.println("firstName:"+firstName.matches(regex));
        System.out.println("gmail:"+gmail.matches(emailregex));

    }
}
