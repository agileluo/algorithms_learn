
public class ReSizeArrayStack<T> {
	public static void main(String[] args) {
		ReSizeArrayStack<String> stack = new ReSizeArrayStack<String>();
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
	private Object[] content = null;
	private int N = 0;
	
	public ReSizeArrayStack() {
		content = new Object[1];
	}
	private int size() {
		return N;
	}
	private T pop() {
		return (T)content[--N];
	}
	private void push(T item) {
		if(N == content.length) reSize(N * 2);
		content[N++] = item;
	}
	private void reSize(int size) {
		Object[] tmp = new Object[size];
		for(int i = 0; i < N; i++){
			tmp[i] = content[i];
		}
		content = tmp;
	}
}
