class MyQueue {

    Stack<Integer> firstStack, secondStack;
    
    public MyQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }
    
    public void push(int x) {
        firstStack.push(x);
    }
    
    public int pop() {
        int ans;
        
        while(!firstStack.isEmpty())
            secondStack.push(firstStack.pop());

        ans = secondStack.pop();

        while(!secondStack.isEmpty())
            firstStack.push(secondStack.pop());
        
        return ans;
        
    }
    
    public int peek() {
        int ans;
        
        while(!firstStack.isEmpty())
            secondStack.push(firstStack.pop());

        ans = secondStack.peek();

        while(!secondStack.isEmpty())
            firstStack.push(secondStack.pop());
        
        return ans;
    }
    
    public boolean empty() {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */