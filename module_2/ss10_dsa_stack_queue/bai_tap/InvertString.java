package ss10_dsa_stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class InvertString<E> {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();

        String[] mWord = str.split("");
        System.out.println(mWord);


        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }

        String[] outp = new String[wStack.size()];
        for (int i = 0; i < mWord.length; i++) {
            outp[i] = wStack.pop();
        }
        System.out.println(outp);

    }

}

