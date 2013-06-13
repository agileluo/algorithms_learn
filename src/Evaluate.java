
public class Evaluate {
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while(!StdIn.isEmpty()){
			String str = StdIn.readString();
			if(str.equals(" ") || str.equals("(")) ;
			else if(str.equals("+")) ops.push(str);
			else if(str.equals("-")) ops.push(str);
			else if(str.equals(")")){
				String op = ops.pop();
				double val = vals.pop();
				if(op.equals("+")) vals.push(vals.pop() + val);
				else if(op.equals("-")) vals.push(vals.pop() - val);
			}else{
				vals.push(Double.parseDouble(str));
			}
		}
		System.out.println(vals.pop());
	}
}
