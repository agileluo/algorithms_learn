
public class Exercise1_1_16 {
	 public static void main(String[] args) {
		System.out.println(exR(6));
	 }
	 public static String exR(int n){
		if( n <= 0) return "";
		return exR(n-3) + n + exR(n-2) + n;
	 }
}
