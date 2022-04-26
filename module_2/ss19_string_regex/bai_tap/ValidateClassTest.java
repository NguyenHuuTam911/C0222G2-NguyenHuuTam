package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateClassTest {
    public static ValidateClass validateClass;



    public static void main(String[] args) {
        validateClass = new ValidateClass();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên lớp: ");
        String className = scanner.nextLine();
        boolean isValid = validateClass.validate(className);
        System.out.println("Class is " +className+ " is valid: " +isValid);
        }
    }

