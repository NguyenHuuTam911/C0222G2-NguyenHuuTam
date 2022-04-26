package ss19_string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX ="^[0-9]{2}+(\\-[0-9]{10})$";
    public ValidatePhoneNumber(){
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
