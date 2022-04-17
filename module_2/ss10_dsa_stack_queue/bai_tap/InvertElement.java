package ss10_dsa_stack_Queue.bai_tap;

import ss2_loop.thuc_hanh.InterestRates;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class InvertElement<E> {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        Integer[] array = new Integer[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= array.length; i++) {
            System.out.print("Enter element array thứ " + i + ":");
            int m = Integer.parseInt(scanner.nextLine());
            stack.push(m);
        }
        for (int j = 1; j <= stack.size(); ) {
            stack1.push(stack.pop());

        }


        System.out.println(stack1);
    }
}
