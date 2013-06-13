
public class Exercise1_1_18 {
	 public static void main(String[] args) {
		 for(int i = 1; i < 10; i++){
			 System.out.print(mystery(1, i) + " ");
		 }
		System.out.println();
		for(int i = 1; i < 10; i++){
			System.out.print(mystery(2, i) + " ");
		}
		System.out.println();
		for(int i = 1; i < 10; i++){
			System.out.print(mystery(3, i) + " ");
		}
	 }
	 public static int mystery(int a, int b){
		if( b == 0 ) return 0;
		if( b % 2 == 0) return mystery(a * a, b / 2);
		return mystery(a * a , b / 2 ) + a;
	 }
}
