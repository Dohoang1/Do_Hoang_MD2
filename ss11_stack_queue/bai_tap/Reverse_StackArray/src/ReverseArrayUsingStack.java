import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println("interger array after reversing stack: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



        String mWord = "kcufdiputs";

        Stack<Object> stack1 = new Stack<>();
        for (int i = 0; i < mWord.length(); i++) {
            stack1.push(mWord.substring(i, i + 1));
        }

        String outp="";
        while (!stack1.isEmpty()) {
            mWord = (String) stack1.pop();
            outp += mWord + " ";
        }
        System.out.println("\nString after reversing stack: ");
        System.out.println(outp.toUpperCase());

    }
}
