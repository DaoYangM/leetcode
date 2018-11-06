package top.daoyang.easy;

import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        ValidBrackets validBrackets = new ValidBrackets();
        System.out.println(validBrackets.isValid("(()"));
    }

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String bracket = s.substring(i, i + 1);
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                stack.push(bracket);
            } else if (!stack.empty()) {
                if (bracket.equals(")")) {
                    if (!stack.pop().equals("(")) {
                        return false;
                    }
                } else if (bracket.equals("}")) {
                    if (!stack.pop().equals("{")) {
                        return false;
                    }
                } else if (bracket.equals("]")) {
                    if (!stack.pop().equals("[")) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        if (!stack.isEmpty())
            return false;
        return true;
    }
}
