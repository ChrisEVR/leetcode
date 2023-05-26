class MyStack {

    ArrayDeque<Byte> cola1, cola2;
    
    public MyStack() {
        cola1 = new ArrayDeque<>();
        cola2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        cola1.add((byte)x);
    }
    
    public int pop() {
        byte ans;
        
        while(cola1.size() > 1) cola2.addLast(cola1.removeFirst());
        
        ans = cola1.pop();
        
        while(!cola2.isEmpty()) cola1.addLast(cola2.removeFirst());
            
        return ans;
    }
    
    public int top() {  
        byte ans;
        
        while(cola1.size() > 1) cola2.addLast(cola1.removeFirst());
        
        ans = cola1.pop();
        
        cola2.addLast(ans);
        
        while(!cola2.isEmpty()) cola1.addLast(cola2.removeFirst());
        
        return ans;    
    }
    
    public boolean empty() {
        return cola1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */