package SecondTask;

import java.util.Stack;

public class CheckingRegex {
    static String correctString = "([][[]()])";
    static String incorrectString = "([][]()])";
    static String notEmptyStack = "([][[]()])(";
    static String emptyStack = ")]";

    public static void main(String[] args) {

        boolean result = false;
        try {
            result = isCorrect(emptyStack);
        } catch (RuntimeException ex) {
        }
        if (result) {
            System.out.println("Корректное регулярное выражение");
        } else {
            System.out.println("Регулярное выражение является некорректным");
        }
    }

    public static boolean isCorrect(String regEx) {
        Stack<Character> stack = new Stack<>();
        char[] array = regEx.toCharArray();

        for (char ch : array) {
            if ((ch == '(') | (ch == '['))  {
                stack.push(ch);
            }
            if (ch == ')') {
                if ('(' == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (ch == ']') {
                if ('[' == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
