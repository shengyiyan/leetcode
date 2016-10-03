public class MinStack {

	List<Integer> s = new LinkedList();
	List<Integer> q = new LinkedList();

	public void push(int x) {
	    if(q.isEmpty()) q.add(x);
	    else if(x <= q.get(q.size()-1)) q.add(x);
	    s.add(x);    
	}

	public void pop() {
	    if(s.size()<1) return;
	    if(top() == q.get(q.size()-1)) q.remove(q.size()-1);
	    s.remove(s.size()-1);
	}

	public int top() {
	    if(s.size()<1) return 0;
	    return s.get(s.size()-1);
	}

	public int getMin() {
	    return q.get(q.size()-1);
	}
}