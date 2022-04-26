package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidatePhoneNumberTest {
    public static ValidatePhoneNumber validatePhoneNumber;

    public static void main(String[] args) {
        validatePhoneNumber =  new ValidatePhoneNumber();
        Scanner scanner =  new Scanner(System.in);
        System.out.print("nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        boolean isvalid = validatePhoneNumber.validate(phoneNumber);
        System.out.println(" phone is " +phoneNumber+ " is valid: " +isvalid);
    }

}
