package leetcode;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> stack;
    private int index;

    /** initialize your data structure here. */
    public MaxStack() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        int max = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            max = Math.max(max, integer);
        }
        return max;
    }

    public int popMax() {
        Integer max = Integer.MIN_VALUE;
        index = -1;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) >= max) {
                max = stack.get(i);
                index = i;
            }
        }
        stack.remove(index);
        return max;
    }

    public static void main(String[] args) {
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        stack.top();
        stack.popMax();
        stack.top();
        stack.peekMax();
        stack.pop();
        stack.top();
    }
}
