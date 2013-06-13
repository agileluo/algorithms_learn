
public class MyStack<T> {
	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<String>();
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!item.equals("-")){
				stack.push(item);
			}else{
				StdOut.println(stack.pop());
			}
		}
		StdOut.println("There get " +  stack.size() + " on the left");
	}
	
	private int N;
	private Node first;
	private class Node{
		T t;
		Node next;
	}
	
	private int size() {
		return N;
	}

	private T pop() {
		T result = first.t;
		first = first.next;
		N--;
		return result;
	}

	private void push(T item) {
		Node node = new Node();
		node.t = item;
		Node oldFirst = first;
		first = node;
		first.next = oldFirst;
		N++;
	}
	
}
