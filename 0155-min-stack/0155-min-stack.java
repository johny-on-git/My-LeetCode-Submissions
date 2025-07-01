class MinStack {

    static class Element{
    
    final int value;
    final int min;
    
    Element(int value, int min)
    {
        this.value=value;
        this.min=min;
    }

    }
    
    final Stack<Element> s;
    public MinStack() {

        s = new Stack<Element>();
        
    }
    
    public void push(int val) {

        if(s.isEmpty())
        {
            s.push(new Element(val,val));
        }
        else
        {
            int min=Math.min(s.peek().min,val);
            s.push(new Element(val,min));
        }
        
    }
    
    public void pop() {
        s.pop();
        
    }
    
    public int top() {
        return s.peek().value;
        
    }
    
    public int getMin() {
        return s.peek().min;
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