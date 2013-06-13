
public class Exercise1_1_9 {
	 public static void main(String[] args) {
		System.out.println(getBitStr2(9));
	}
	public static String getBitStr(int num){
		StringBuilder sb = new StringBuilder();
		int devider = num;
		while(devider > 0){
			sb.append(devider % 2);
			devider /= 2;
		}
		sb.reverse();
		return sb.toString();
	}
	public static String getBitStr2(int num){
		StringBuilder result = new StringBuilder();
		for(int n = num; n > 0 ; n /= 2){
			result.insert(0, n % 2);
		}
		return result.toString();
	}
}
