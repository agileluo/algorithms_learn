

public class Chapter_1_3_1_6 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!StdIn.isEmpty()){
			stack.push(StdIn.readInt());
		}
		for(int i : stack){
			StdOut.println(i);
		}
	}
}
