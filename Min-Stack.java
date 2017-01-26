/*Implement a Stack with Min functions */

//Common way of doing it with 2 Stacks
public class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> mins;
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<Integer>();
        mins = new Stack<Integer>();
        data.push(-1);
        mins.push(Integer.MAX_VALUE);
    }
    public void push(int x) {
        data.push(x);
        mins.push(Math.min(x, mins.peek()));
    }
    public void pop() {
        if (data.size() > 1) {
            data.pop();
            mins.pop();
        }   
    }
     
    public int top() {
        return data.peek();
    }
     
    public int getMin() {
        return mins.peek();
    }
}



//Minimum Stack Using only 1 Stack

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
