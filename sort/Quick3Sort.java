/**
 * 三向切分快速排序算法
 * @author agileluo
 *
 */
public class Quick3Sort {
	public static void main(String[] args) {
		String[] a = In.readStrings();
		SortExample.show(a);
		sort(a);
		assert SortExample.isSorted(a);
		SortExample.show(a);
	}
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length-1);
	}
	private static void sort(Comparable[] a, int lo, int hi) {
		if(hi <= lo) return;
		int lt = lo, i = lo + 1, gt = hi;
		Comparable v = a[lo];
		while(i <= gt){
			int comp = a[i].compareTo(v);
			if ( comp < 0) SortExample.exch(a, lt++, i++);
			else if( comp > 0) SortExample.exch(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt-1);
		sort(a, gt + 1, hi);
	}
}
