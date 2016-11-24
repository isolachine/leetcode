package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        queue1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        queue1.poll();
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    // Get the top element.
    public int top() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int i = queue1.poll();
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        queue1.add(i);
        return i;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
