package ss5_accessmodifier_static.bai_tap;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Smith");
        student.setClasses("C0222G2");
        System.out.println("Name: "+student.getName()+"\n"+"Classes: "+student.getClasses());



    }
}
