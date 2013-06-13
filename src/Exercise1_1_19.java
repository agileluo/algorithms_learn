
public class Exercise1_1_19 {
	 public static void main(String[] args) {
		System.out.println(rank(8, new int[]{0, 1, 2, 3, 8}));
	 }
	 public static int  rank(int key, int[] a){
		 return rank(key, a, 0, a.length -1);
	 }
	 public static int  rank(int key, int[] a, int lo, int lh){
		 System.out.println(a[lo] + ", " + a[lh]);
		 if( lh < lo)  return -1;
		 int mid = lo + (lh - lo) / 2;
		 if(key > a[mid] ) return rank(key, a, mid + 1, lh);
		 else if(key < a[mid] ) return rank(key, a, lo, mid -1);
		 else return mid;
	 }
}
