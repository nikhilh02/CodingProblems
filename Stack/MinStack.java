package Stack;

import java.util.Stack;

class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minStack;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || (val <= minStack.peek())){
            minStack.push(val);
        }
    }

    public void pop() {
        if(st.isEmpty())
            return;
        int top = st.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
