//https://leetcode.com/problems/implement-queue-using-stacks/
//acts as a queue by keeping everything in the correct queue order on top of the stack
//flip, insert, then flip again whenever inserting something in to keep that order

import java.util.Stack;

public class QueueUsingStacks
{
	Stack<Integer> stack = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x)
    {
        flip();
        
        Stack<Integer> newStack = new Stack<Integer>();
        newStack.push(x);
        
        while (!stack.empty())
        {
            newStack.push(stack.pop());
        }
        
        stack = newStack;
    }
    
    private void flip ()
    {
        Stack<Integer> newStack = new Stack<Integer>();
        
        while (!stack.empty())
        {
            newStack.push(stack.pop());
        }
        
        stack = newStack;
    }

    // Removes the element from in front of queue.
    public void pop()
    {
       stack.pop(); 
    }

    // Get the front element.
    public int peek()
    {
        return stack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty()
    {
        return stack.empty();
    }
}
