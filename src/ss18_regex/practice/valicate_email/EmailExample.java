package ss18_regex.practice.valicate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[a-z](\\w+)?@[a-z]{2,}\\.[a-z]+(\\.[a-z]+)?$";

    public static final String[] VALID_EMAIL = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] INVALID_EMAIL = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailExample emailExample1 = new EmailExample();
        for (String s : VALID_EMAIL) {
            boolean isvalid = emailExample1.validate(s);
            System.out.println("Email is " + s + " is valid : " +isvalid);
        }
        for (String s : INVALID_EMAIL) {
            boolean isvalid = emailExample1.validate(s);
            System.out.println("Email is " + s + " is valid : " +isvalid);
        }
    }
}
