package top.daoyang.tencent;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String q = s.substring(i, i + 1);
            if (q.equals("(") || q.equals("{") || q.equals("["))
                stack.push(q);
            else if (q.equals(" "))
                continue;
            else {
                if (stack.isEmpty())
                    return false;
                String pop = stack.pop();
                switch (pop) {
                    case "(":
                     if (!q.equals(")")) return false;
                     break;
                    case "{":
                        if (!q.equals("}")) return false;
                        break;
                    case "[":
                        if (!q.equals("]")) return false;
                        break;
                }
            }
        }
//        if (stack.isEmpty())
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new IsValid().isValid("()"));
    }
}
