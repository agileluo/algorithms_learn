
public class Exercise1_1_12 {
	 public static void main(String[] args) {
		 int[] a = new int[9];
		 for(int i = 0; i < a.length; i++){
			 a[i] = a.length - 1 - i;
		 }
		 for(int i = 0; i < a.length; i++){
			 a[i] = a[a[i]];
		 }
		 for(int i : a){
			 System.out.print(i + " ");
		 }
	 }
}
