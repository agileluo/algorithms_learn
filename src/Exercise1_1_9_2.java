
public class Exercise1_1_9_2 {
	 public static void main(String[] args) {
		System.out.println(getBitStr(0));
	}

	public static String getBitStr(int i) {
		String result = "";
		for(int k = i; k > 0; k /= 2){
			result = k % 2 + result;
		}
		return result;
	}
	
}
