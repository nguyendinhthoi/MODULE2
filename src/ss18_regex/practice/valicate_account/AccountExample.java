package ss18_regex.practice.valicate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public static final String[] VALID_ACCOUNT = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String[] INVALID_ACCOUNT = new String[]{".@", "12345", "1234_", "abcde"};

    public AccountExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String s : VALID_ACCOUNT) {
            boolean isvalid = accountExample.validate(s);
            System.out.println("Account is " + s + " is valid : " + isvalid);
        }
        for (String s : INVALID_ACCOUNT) {
            boolean isvalid = accountExample.validate(s);
            System.out.println("Account is " + s + " is valid : " + isvalid);
        }
    }

}
