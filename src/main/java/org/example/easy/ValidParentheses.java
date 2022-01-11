package org.example.easy;

import java.util.Stack;

/**
 * 链接：https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author di_deng@droidhang.com
 */
public class ValidParentheses {

    /**
     * 使用栈先入后出的思想，右括号压入栈中，等到左括号出现的时候，弹出栈顶数据进行比较
     */
    public boolean isValidOne(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                characterStack.push(c);
            } else if (c == '}' && (characterStack.empty() || characterStack.pop() != '{')) {
                return false;
            } else if (c == ')' && (characterStack.empty() || characterStack.pop() != '(')) {
                return false;
            } else if (c == ']' && (characterStack.empty() || characterStack.pop() != '[')) {
                return false;
            }
        }

        return characterStack.empty();
    }

    /**
     * 数组实现stack
     */
    public boolean isValidTwo(String s) {
        int top = 1;
        char[] stack = new char[s.length() + 1];
        for (char c: s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack[top++] = c;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            }
        }

        return top == 1;
    }


}
